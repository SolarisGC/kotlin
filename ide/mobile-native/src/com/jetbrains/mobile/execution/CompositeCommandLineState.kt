package com.jetbrains.mobile.execution

import com.intellij.execution.DefaultExecutionResult
import com.intellij.execution.ExecutionResult
import com.intellij.execution.Executor
import com.intellij.execution.configurations.CommandLineState
import com.intellij.execution.process.ProcessHandler
import com.intellij.execution.runners.ExecutionEnvironment
import com.intellij.execution.runners.ProgramRunner
import com.intellij.execution.ui.ExecutionConsole
import com.intellij.util.SmartList

class CompositeCommandLineState(
    environment: ExecutionEnvironment,
    val states: List<CommandLineState>
) : CommandLineState(environment) {
    init {
        assert(states.isNotEmpty())
    }

    override fun execute(executor: Executor, runner: ProgramRunner<*>): ExecutionResult {
        val handlers = SmartList<ProcessHandler>()
        val consoles = SmartList<ExecutionConsole>()
        for (state in states) {
            val result = state.execute(executor, runner)
            handlers += result.processHandler
            consoles += result.executionConsole
        }
        return DefaultExecutionResult(consoles.singleOrNull(), CompositeProcessHandler(handlers))
    }

    override fun startProcess(): ProcessHandler = throw IllegalStateException()
}
