/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */
package org.jetbrains.kotlin.cli.jvm.compiler.jarfs

import com.intellij.openapi.vfs.VirtualFile
import java.io.File
import java.io.FileNotFoundException
import java.io.RandomAccessFile
import java.nio.channels.FileChannel

class FastJarHandler(val fileSystem: FastJarFileSystem, path: String) {
    private val myRoot: VirtualFile?
    internal val file = File(path)

    private val cachedManifest: ByteArray?

    init {
        val entries: List<ZipEntryDescription>
        RandomAccessFile(file, "r").use { randomAccessFile ->
            val mappedByteBuffer = randomAccessFile.channel.map(FileChannel.MapMode.READ_ONLY, 0, randomAccessFile.length())
            try {
                entries = mappedByteBuffer.parseCentralDirectory()
                cachedManifest = entries.singleOrNull { it.relativePath == MANIFEST_PATH }?.let(mappedByteBuffer::contentsToByteArray)
            } finally {
                with(fileSystem) {
                    mappedByteBuffer.unmapBuffer()
                }
            }
        }

        myRoot = FastJarVirtualFile.create(this, "", -1, parent = null, entryDescription = null)

        val filesByRelativePath = HashMap<String, FastJarVirtualFile>(entries.size)
        filesByRelativePath[""] = myRoot

        for (entryDescription in entries) {
            if (!entryDescription.isDirectory) {
                createFile(entryDescription, filesByRelativePath)
            } else {
                getOrCreateDirectory(entryDescription.relativePath, filesByRelativePath)
            }
        }

        for (node in filesByRelativePath.values) {
            node.initChildrenArrayFromList()
        }
    }

    private fun createFile(entry: ZipEntryDescription, directories: MutableMap<String, FastJarVirtualFile>): FastJarVirtualFile {
        val (parentName, shortName) = entry.relativePath.splitPath()

        val parentFile = getOrCreateDirectory(parentName, directories)
        if ("." == shortName) {
            return parentFile
        }

        return FastJarVirtualFile.create(
            this, shortName,
            if (entry.isDirectory) -1 else entry.uncompressedSize,
            parentFile,
            entry,
        )
    }

    private fun getOrCreateDirectory(entryName: CharSequence, directories: MutableMap<String, FastJarVirtualFile>): FastJarVirtualFile {
        return directories.getOrPut(entryName.toString()) {
            val (parentPath, shortName) = entryName.splitPath()
            val parentFile = getOrCreateDirectory(parentPath, directories)

            FastJarVirtualFile.create(this, shortName, -1, parentFile, entryDescription = null)
        }
    }

    private fun CharSequence.splitPath(): Pair<CharSequence, CharSequence> {
        var slashIndex = this.length - 1

        while (slashIndex >= 0 && this[slashIndex] != '/') {
            slashIndex--
        }

        if (slashIndex == -1) return Pair("", this)
        return Pair(subSequence(0, slashIndex), subSequence(slashIndex + 1, this.length))
    }

    fun findFileByPath(pathInJar: String): VirtualFile? {
        return myRoot?.findFileByRelativePath(pathInJar)
    }

    fun contentsToByteArray(zipEntryDescription: ZipEntryDescription): ByteArray {
        val relativePath = zipEntryDescription.relativePath
        if (relativePath == MANIFEST_PATH) return cachedManifest ?: throw FileNotFoundException("$file!/$relativePath")
        return fileSystem.cachedOpenFileHandles[file].use {
            synchronized(it) {
                it.get().second.contentsToByteArray(zipEntryDescription)
            }
        }
    }
}

private const val MANIFEST_PATH = "META-INF/MANIFEST.MF"
