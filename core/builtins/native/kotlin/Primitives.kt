/*
 * Copyright 2010-2021 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

// Auto-generated file. DO NOT EDIT!

package kotlin

/**
 * Represents a 8-bit signed integer.
 * On the JVM, non-nullable values of this type are represented as values of the primitive type `byte`.
 */
public class Byte private constructor() : Number(), Comparable<Byte> {
    companion object {
        /**
         * A constant holding the minimum value an instance of Byte can have.
         */
        public const val MIN_VALUE: Byte = -128

        /**
         * A constant holding the maximum value an instance of Byte can have.
         */
        public const val MAX_VALUE: Byte = 127

        /**
         * The number of bytes used to represent an instance of Byte in a binary form.
         */
        @SinceKotlin("1.3")
        public const val SIZE_BYTES: Int = 1

        /**
         * The number of bits used to represent an instance of Byte in a binary form.
         */
        @SinceKotlin("1.3")
        public const val SIZE_BITS: Int = 8
    }

    /**
     * Compares this value with the specified value for order.
     * Returns zero if this value is equal to the specified other value, a negative number if it's less than other,
     * or a positive number if it's greater than other.
     */
    @CompileTimeCalculation
    public override operator fun compareTo(other: Byte): Int

    /**
     * Compares this value with the specified value for order.
     * Returns zero if this value is equal to the specified other value, a negative number if it's less than other,
     * or a positive number if it's greater than other.
     */
    @CompileTimeCalculation
    public operator fun compareTo(other: Short): Int

    /**
     * Compares this value with the specified value for order.
     * Returns zero if this value is equal to the specified other value, a negative number if it's less than other,
     * or a positive number if it's greater than other.
     */
    @CompileTimeCalculation
    public operator fun compareTo(other: Int): Int

    /**
     * Compares this value with the specified value for order.
     * Returns zero if this value is equal to the specified other value, a negative number if it's less than other,
     * or a positive number if it's greater than other.
     */
    @CompileTimeCalculation
    public operator fun compareTo(other: Long): Int

    /**
     * Compares this value with the specified value for order.
     * Returns zero if this value is equal to the specified other value, a negative number if it's less than other,
     * or a positive number if it's greater than other.
     */
    @CompileTimeCalculation
    public operator fun compareTo(other: Float): Int

    /**
     * Compares this value with the specified value for order.
     * Returns zero if this value is equal to the specified other value, a negative number if it's less than other,
     * or a positive number if it's greater than other.
     */
    @CompileTimeCalculation
    public operator fun compareTo(other: Double): Int

    /** Adds the other value to this value. */
    @CompileTimeCalculation
    public operator fun plus(other: Byte): Int
    /** Adds the other value to this value. */
    @CompileTimeCalculation
    public operator fun plus(other: Short): Int
    /** Adds the other value to this value. */
    @CompileTimeCalculation
    public operator fun plus(other: Int): Int
    /** Adds the other value to this value. */
    @CompileTimeCalculation
    public operator fun plus(other: Long): Long
    /** Adds the other value to this value. */
    @CompileTimeCalculation
    public operator fun plus(other: Float): Float
    /** Adds the other value to this value. */
    @CompileTimeCalculation
    public operator fun plus(other: Double): Double

    /** Subtracts the other value from this value. */
    @CompileTimeCalculation
    public operator fun minus(other: Byte): Int
    /** Subtracts the other value from this value. */
    @CompileTimeCalculation
    public operator fun minus(other: Short): Int
    /** Subtracts the other value from this value. */
    @CompileTimeCalculation
    public operator fun minus(other: Int): Int
    /** Subtracts the other value from this value. */
    @CompileTimeCalculation
    public operator fun minus(other: Long): Long
    /** Subtracts the other value from this value. */
    @CompileTimeCalculation
    public operator fun minus(other: Float): Float
    /** Subtracts the other value from this value. */
    @CompileTimeCalculation
    public operator fun minus(other: Double): Double

    /** Multiplies this value by the other value. */
    @CompileTimeCalculation
    public operator fun times(other: Byte): Int
    /** Multiplies this value by the other value. */
    @CompileTimeCalculation
    public operator fun times(other: Short): Int
    /** Multiplies this value by the other value. */
    @CompileTimeCalculation
    public operator fun times(other: Int): Int
    /** Multiplies this value by the other value. */
    @CompileTimeCalculation
    public operator fun times(other: Long): Long
    /** Multiplies this value by the other value. */
    @CompileTimeCalculation
    public operator fun times(other: Float): Float
    /** Multiplies this value by the other value. */
    @CompileTimeCalculation
    public operator fun times(other: Double): Double

    /** Divides this value by the other value, truncating the result to an integer that is closer to zero. */
    @CompileTimeCalculation
    public operator fun div(other: Byte): Int
    /** Divides this value by the other value, truncating the result to an integer that is closer to zero. */
    @CompileTimeCalculation
    public operator fun div(other: Short): Int
    /** Divides this value by the other value, truncating the result to an integer that is closer to zero. */
    @CompileTimeCalculation
    public operator fun div(other: Int): Int
    /** Divides this value by the other value, truncating the result to an integer that is closer to zero. */
    @CompileTimeCalculation
    public operator fun div(other: Long): Long
    /** Divides this value by the other value. */
    @CompileTimeCalculation
    public operator fun div(other: Float): Float
    /** Divides this value by the other value. */
    @CompileTimeCalculation
    public operator fun div(other: Double): Double

    /**
     * Calculates the remainder of truncating division of this value by the other value.
     *
     * The result is either zero or has the same sign as the _dividend_ and has the absolute value less than the absolute value of the divisor.
     */
    @SinceKotlin("1.1")
    @CompileTimeCalculation
    public operator fun rem(other: Byte): Int
    /**
     * Calculates the remainder of truncating division of this value by the other value.
     *
     * The result is either zero or has the same sign as the _dividend_ and has the absolute value less than the absolute value of the divisor.
     */
    @SinceKotlin("1.1")
    @CompileTimeCalculation
    public operator fun rem(other: Short): Int
    /**
     * Calculates the remainder of truncating division of this value by the other value.
     *
     * The result is either zero or has the same sign as the _dividend_ and has the absolute value less than the absolute value of the divisor.
     */
    @SinceKotlin("1.1")
    @CompileTimeCalculation
    public operator fun rem(other: Int): Int
    /**
     * Calculates the remainder of truncating division of this value by the other value.
     *
     * The result is either zero or has the same sign as the _dividend_ and has the absolute value less than the absolute value of the divisor.
     */
    @SinceKotlin("1.1")
    @CompileTimeCalculation
    public operator fun rem(other: Long): Long
    /**
     * Calculates the remainder of truncating division of this value by the other value.
     *
     * The result is either zero or has the same sign as the _dividend_ and has the absolute value less than the absolute value of the divisor.
     */
    @SinceKotlin("1.1")
    @CompileTimeCalculation
    public operator fun rem(other: Float): Float
    /**
     * Calculates the remainder of truncating division of this value by the other value.
     *
     * The result is either zero or has the same sign as the _dividend_ and has the absolute value less than the absolute value of the divisor.
     */
    @SinceKotlin("1.1")
    @CompileTimeCalculation
    public operator fun rem(other: Double): Double

    /**
     * Returns this value incremented by one.
     *
     * @sample samples.misc.Builtins.inc
     */
    public operator fun inc(): Byte

    /**
     * Returns this value decremented by one.
     *
     * @sample samples.misc.Builtins.dec
     */
    public operator fun dec(): Byte

    /** Returns this value. */
    @CompileTimeCalculation
    public operator fun unaryPlus(): Int
    /** Returns the negative of this value. */
    @CompileTimeCalculation
    public operator fun unaryMinus(): Int

     /** Creates a range from this value to the specified [other] value. */
    public operator fun rangeTo(other: Byte): IntRange
     /** Creates a range from this value to the specified [other] value. */
    public operator fun rangeTo(other: Short): IntRange
     /** Creates a range from this value to the specified [other] value. */
    public operator fun rangeTo(other: Int): IntRange
     /** Creates a range from this value to the specified [other] value. */
    public operator fun rangeTo(other: Long): LongRange

    /** Returns this value. */
    @CompileTimeCalculation
    public override fun toByte(): Byte
    /**
     * Converts this [Byte] value to [Char].
     *
     * If this value is non-negative, the resulting `Char` code is equal to this value.
     *
     * The least significant 8 bits of the resulting `Char` code are the same as the bits of this `Byte` value,
     * whereas the most significant 8 bits are filled with the sign bit of this value.
     */
    @Deprecated("Direct conversion to Char is deprecated. Use toInt().toChar() or Char constructor instead.", ReplaceWith("this.toInt().toChar()"))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    @CompileTimeCalculation
    public override fun toChar(): Char
    /**
     * Converts this [Byte] value to [Short].
     *
     * The resulting `Short` value represents the same numerical value as this `Byte`.
     *
     * The least significant 8 bits of the resulting `Short` value are the same as the bits of this `Byte` value,
     * whereas the most significant 8 bits are filled with the sign bit of this value.
     */
    @CompileTimeCalculation
    public override fun toShort(): Short
    /**
     * Converts this [Byte] value to [Int].
     *
     * The resulting `Int` value represents the same numerical value as this `Byte`.
     *
     * The least significant 8 bits of the resulting `Int` value are the same as the bits of this `Byte` value,
     * whereas the most significant 24 bits are filled with the sign bit of this value.
     */
    @CompileTimeCalculation
    public override fun toInt(): Int
    /**
     * Converts this [Byte] value to [Long].
     *
     * The resulting `Long` value represents the same numerical value as this `Byte`.
     *
     * The least significant 8 bits of the resulting `Long` value are the same as the bits of this `Byte` value,
     * whereas the most significant 56 bits are filled with the sign bit of this value.
     */
    @CompileTimeCalculation
    public override fun toLong(): Long
    /**
     * Converts this [Byte] value to [Float].
     *
     * The resulting `Float` value represents the same numerical value as this `Byte`.
     */
    @CompileTimeCalculation
    public override fun toFloat(): Float
    /**
     * Converts this [Byte] value to [Double].
     *
     * The resulting `Double` value represents the same numerical value as this `Byte`.
     */
    @CompileTimeCalculation
    public override fun toDouble(): Double

    @CompileTimeCalculation
    public override fun toString(): String

    @CompileTimeCalculation
    public override fun equals(other: Any?): Boolean
}

/**
 * Represents a 16-bit signed integer.
 * On the JVM, non-nullable values of this type are represented as values of the primitive type `short`.
 */
public class Short private constructor() : Number(), Comparable<Short> {
    companion object {
        /**
         * A constant holding the minimum value an instance of Short can have.
         */
        public const val MIN_VALUE: Short = -32768

        /**
         * A constant holding the maximum value an instance of Short can have.
         */
        public const val MAX_VALUE: Short = 32767

        /**
         * The number of bytes used to represent an instance of Short in a binary form.
         */
        @SinceKotlin("1.3")
        public const val SIZE_BYTES: Int = 2

        /**
         * The number of bits used to represent an instance of Short in a binary form.
         */
        @SinceKotlin("1.3")
        public const val SIZE_BITS: Int = 16
    }

    /**
     * Compares this value with the specified value for order.
     * Returns zero if this value is equal to the specified other value, a negative number if it's less than other,
     * or a positive number if it's greater than other.
     */
    @CompileTimeCalculation
    public operator fun compareTo(other: Byte): Int

    /**
     * Compares this value with the specified value for order.
     * Returns zero if this value is equal to the specified other value, a negative number if it's less than other,
     * or a positive number if it's greater than other.
     */
    @CompileTimeCalculation
    public override operator fun compareTo(other: Short): Int

    /**
     * Compares this value with the specified value for order.
     * Returns zero if this value is equal to the specified other value, a negative number if it's less than other,
     * or a positive number if it's greater than other.
     */
    @CompileTimeCalculation
    public operator fun compareTo(other: Int): Int

    /**
     * Compares this value with the specified value for order.
     * Returns zero if this value is equal to the specified other value, a negative number if it's less than other,
     * or a positive number if it's greater than other.
     */
    @CompileTimeCalculation
    public operator fun compareTo(other: Long): Int

    /**
     * Compares this value with the specified value for order.
     * Returns zero if this value is equal to the specified other value, a negative number if it's less than other,
     * or a positive number if it's greater than other.
     */
    @CompileTimeCalculation
    public operator fun compareTo(other: Float): Int

    /**
     * Compares this value with the specified value for order.
     * Returns zero if this value is equal to the specified other value, a negative number if it's less than other,
     * or a positive number if it's greater than other.
     */
    @CompileTimeCalculation
    public operator fun compareTo(other: Double): Int

    /** Adds the other value to this value. */
    @CompileTimeCalculation
    public operator fun plus(other: Byte): Int
    /** Adds the other value to this value. */
    @CompileTimeCalculation
    public operator fun plus(other: Short): Int
    /** Adds the other value to this value. */
    @CompileTimeCalculation
    public operator fun plus(other: Int): Int
    /** Adds the other value to this value. */
    @CompileTimeCalculation
    public operator fun plus(other: Long): Long
    /** Adds the other value to this value. */
    @CompileTimeCalculation
    public operator fun plus(other: Float): Float
    /** Adds the other value to this value. */
    @CompileTimeCalculation
    public operator fun plus(other: Double): Double

    /** Subtracts the other value from this value. */
    @CompileTimeCalculation
    public operator fun minus(other: Byte): Int
    /** Subtracts the other value from this value. */
    @CompileTimeCalculation
    public operator fun minus(other: Short): Int
    /** Subtracts the other value from this value. */
    @CompileTimeCalculation
    public operator fun minus(other: Int): Int
    /** Subtracts the other value from this value. */
    @CompileTimeCalculation
    public operator fun minus(other: Long): Long
    /** Subtracts the other value from this value. */
    @CompileTimeCalculation
    public operator fun minus(other: Float): Float
    /** Subtracts the other value from this value. */
    @CompileTimeCalculation
    public operator fun minus(other: Double): Double

    /** Multiplies this value by the other value. */
    @CompileTimeCalculation
    public operator fun times(other: Byte): Int
    /** Multiplies this value by the other value. */
    @CompileTimeCalculation
    public operator fun times(other: Short): Int
    /** Multiplies this value by the other value. */
    @CompileTimeCalculation
    public operator fun times(other: Int): Int
    /** Multiplies this value by the other value. */
    @CompileTimeCalculation
    public operator fun times(other: Long): Long
    /** Multiplies this value by the other value. */
    @CompileTimeCalculation
    public operator fun times(other: Float): Float
    /** Multiplies this value by the other value. */
    @CompileTimeCalculation
    public operator fun times(other: Double): Double

    /** Divides this value by the other value, truncating the result to an integer that is closer to zero. */
    @CompileTimeCalculation
    public operator fun div(other: Byte): Int
    /** Divides this value by the other value, truncating the result to an integer that is closer to zero. */
    @CompileTimeCalculation
    public operator fun div(other: Short): Int
    /** Divides this value by the other value, truncating the result to an integer that is closer to zero. */
    @CompileTimeCalculation
    public operator fun div(other: Int): Int
    /** Divides this value by the other value, truncating the result to an integer that is closer to zero. */
    @CompileTimeCalculation
    public operator fun div(other: Long): Long
    /** Divides this value by the other value. */
    @CompileTimeCalculation
    public operator fun div(other: Float): Float
    /** Divides this value by the other value. */
    @CompileTimeCalculation
    public operator fun div(other: Double): Double

    /**
     * Calculates the remainder of truncating division of this value by the other value.
     *
     * The result is either zero or has the same sign as the _dividend_ and has the absolute value less than the absolute value of the divisor.
     */
    @SinceKotlin("1.1")
    @CompileTimeCalculation
    public operator fun rem(other: Byte): Int
    /**
     * Calculates the remainder of truncating division of this value by the other value.
     *
     * The result is either zero or has the same sign as the _dividend_ and has the absolute value less than the absolute value of the divisor.
     */
    @SinceKotlin("1.1")
    @CompileTimeCalculation
    public operator fun rem(other: Short): Int
    /**
     * Calculates the remainder of truncating division of this value by the other value.
     *
     * The result is either zero or has the same sign as the _dividend_ and has the absolute value less than the absolute value of the divisor.
     */
    @SinceKotlin("1.1")
    @CompileTimeCalculation
    public operator fun rem(other: Int): Int
    /**
     * Calculates the remainder of truncating division of this value by the other value.
     *
     * The result is either zero or has the same sign as the _dividend_ and has the absolute value less than the absolute value of the divisor.
     */
    @SinceKotlin("1.1")
    @CompileTimeCalculation
    public operator fun rem(other: Long): Long
    /**
     * Calculates the remainder of truncating division of this value by the other value.
     *
     * The result is either zero or has the same sign as the _dividend_ and has the absolute value less than the absolute value of the divisor.
     */
    @SinceKotlin("1.1")
    @CompileTimeCalculation
    public operator fun rem(other: Float): Float
    /**
     * Calculates the remainder of truncating division of this value by the other value.
     *
     * The result is either zero or has the same sign as the _dividend_ and has the absolute value less than the absolute value of the divisor.
     */
    @SinceKotlin("1.1")
    @CompileTimeCalculation
    public operator fun rem(other: Double): Double

    /**
     * Returns this value incremented by one.
     *
     * @sample samples.misc.Builtins.inc
     */
    public operator fun inc(): Short

    /**
     * Returns this value decremented by one.
     *
     * @sample samples.misc.Builtins.dec
     */
    public operator fun dec(): Short

    /** Returns this value. */
    @CompileTimeCalculation
    public operator fun unaryPlus(): Int
    /** Returns the negative of this value. */
    @CompileTimeCalculation
    public operator fun unaryMinus(): Int

     /** Creates a range from this value to the specified [other] value. */
    public operator fun rangeTo(other: Byte): IntRange
     /** Creates a range from this value to the specified [other] value. */
    public operator fun rangeTo(other: Short): IntRange
     /** Creates a range from this value to the specified [other] value. */
    public operator fun rangeTo(other: Int): IntRange
     /** Creates a range from this value to the specified [other] value. */
    public operator fun rangeTo(other: Long): LongRange

    /**
     * Converts this [Short] value to [Byte].
     *
     * If this value is in [Byte.MIN_VALUE]..[Byte.MAX_VALUE], the resulting `Byte` value represents
     * the same numerical value as this `Short`.
     *
     * The resulting `Byte` value is represented by the least significant 8 bits of this `Short` value.
     */
    @CompileTimeCalculation
    public override fun toByte(): Byte
    /**
     * Converts this [Short] value to [Char].
     *
     * The resulting `Char` code is equal to this value reinterpreted as an unsigned number,
     * i.e. it has the same binary representation as this `Short`.
     */
    @Deprecated("Direct conversion to Char is deprecated. Use toInt().toChar() or Char constructor instead.", ReplaceWith("this.toInt().toChar()"))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    @CompileTimeCalculation
    public override fun toChar(): Char
    /** Returns this value. */
    @CompileTimeCalculation
    public override fun toShort(): Short
    /**
     * Converts this [Short] value to [Int].
     *
     * The resulting `Int` value represents the same numerical value as this `Short`.
     *
     * The least significant 16 bits of the resulting `Int` value are the same as the bits of this `Short` value,
     * whereas the most significant 16 bits are filled with the sign bit of this value.
     */
    @CompileTimeCalculation
    public override fun toInt(): Int
    /**
     * Converts this [Short] value to [Long].
     *
     * The resulting `Long` value represents the same numerical value as this `Short`.
     *
     * The least significant 16 bits of the resulting `Long` value are the same as the bits of this `Short` value,
     * whereas the most significant 48 bits are filled with the sign bit of this value.
     */
    @CompileTimeCalculation
    public override fun toLong(): Long
    /**
     * Converts this [Short] value to [Float].
     *
     * The resulting `Float` value represents the same numerical value as this `Short`.
     */
    @CompileTimeCalculation
    public override fun toFloat(): Float
    /**
     * Converts this [Short] value to [Double].
     *
     * The resulting `Double` value represents the same numerical value as this `Short`.
     */
    @CompileTimeCalculation
    public override fun toDouble(): Double

    @CompileTimeCalculation
    public override fun toString(): String

    @CompileTimeCalculation
    public override fun equals(other: Any?): Boolean
}

/**
 * Represents a 32-bit signed integer.
 * On the JVM, non-nullable values of this type are represented as values of the primitive type `int`.
 */
public class Int private constructor() : Number(), Comparable<Int> {
    companion object {
        /**
         * A constant holding the minimum value an instance of Int can have.
         */
        public const val MIN_VALUE: Int = -2147483648

        /**
         * A constant holding the maximum value an instance of Int can have.
         */
        public const val MAX_VALUE: Int = 2147483647

        /**
         * The number of bytes used to represent an instance of Int in a binary form.
         */
        @SinceKotlin("1.3")
        public const val SIZE_BYTES: Int = 4

        /**
         * The number of bits used to represent an instance of Int in a binary form.
         */
        @SinceKotlin("1.3")
        public const val SIZE_BITS: Int = 32
    }

    /**
     * Compares this value with the specified value for order.
     * Returns zero if this value is equal to the specified other value, a negative number if it's less than other,
     * or a positive number if it's greater than other.
     */
    @CompileTimeCalculation
    public operator fun compareTo(other: Byte): Int

    /**
     * Compares this value with the specified value for order.
     * Returns zero if this value is equal to the specified other value, a negative number if it's less than other,
     * or a positive number if it's greater than other.
     */
    @CompileTimeCalculation
    public operator fun compareTo(other: Short): Int

    /**
     * Compares this value with the specified value for order.
     * Returns zero if this value is equal to the specified other value, a negative number if it's less than other,
     * or a positive number if it's greater than other.
     */
    @CompileTimeCalculation
    public override operator fun compareTo(other: Int): Int

    /**
     * Compares this value with the specified value for order.
     * Returns zero if this value is equal to the specified other value, a negative number if it's less than other,
     * or a positive number if it's greater than other.
     */
    @CompileTimeCalculation
    public operator fun compareTo(other: Long): Int

    /**
     * Compares this value with the specified value for order.
     * Returns zero if this value is equal to the specified other value, a negative number if it's less than other,
     * or a positive number if it's greater than other.
     */
    @CompileTimeCalculation
    public operator fun compareTo(other: Float): Int

    /**
     * Compares this value with the specified value for order.
     * Returns zero if this value is equal to the specified other value, a negative number if it's less than other,
     * or a positive number if it's greater than other.
     */
    @CompileTimeCalculation
    public operator fun compareTo(other: Double): Int

    /** Adds the other value to this value. */
    @CompileTimeCalculation
    public operator fun plus(other: Byte): Int
    /** Adds the other value to this value. */
    @CompileTimeCalculation
    public operator fun plus(other: Short): Int
    /** Adds the other value to this value. */
    @CompileTimeCalculation
    public operator fun plus(other: Int): Int
    /** Adds the other value to this value. */
    @CompileTimeCalculation
    public operator fun plus(other: Long): Long
    /** Adds the other value to this value. */
    @CompileTimeCalculation
    public operator fun plus(other: Float): Float
    /** Adds the other value to this value. */
    @CompileTimeCalculation
    public operator fun plus(other: Double): Double

    /** Subtracts the other value from this value. */
    @CompileTimeCalculation
    public operator fun minus(other: Byte): Int
    /** Subtracts the other value from this value. */
    @CompileTimeCalculation
    public operator fun minus(other: Short): Int
    /** Subtracts the other value from this value. */
    @CompileTimeCalculation
    public operator fun minus(other: Int): Int
    /** Subtracts the other value from this value. */
    @CompileTimeCalculation
    public operator fun minus(other: Long): Long
    /** Subtracts the other value from this value. */
    @CompileTimeCalculation
    public operator fun minus(other: Float): Float
    /** Subtracts the other value from this value. */
    @CompileTimeCalculation
    public operator fun minus(other: Double): Double

    /** Multiplies this value by the other value. */
    @CompileTimeCalculation
    public operator fun times(other: Byte): Int
    /** Multiplies this value by the other value. */
    @CompileTimeCalculation
    public operator fun times(other: Short): Int
    /** Multiplies this value by the other value. */
    @CompileTimeCalculation
    public operator fun times(other: Int): Int
    /** Multiplies this value by the other value. */
    @CompileTimeCalculation
    public operator fun times(other: Long): Long
    /** Multiplies this value by the other value. */
    @CompileTimeCalculation
    public operator fun times(other: Float): Float
    /** Multiplies this value by the other value. */
    @CompileTimeCalculation
    public operator fun times(other: Double): Double

    /** Divides this value by the other value, truncating the result to an integer that is closer to zero. */
    @CompileTimeCalculation
    public operator fun div(other: Byte): Int
    /** Divides this value by the other value, truncating the result to an integer that is closer to zero. */
    @CompileTimeCalculation
    public operator fun div(other: Short): Int
    /** Divides this value by the other value, truncating the result to an integer that is closer to zero. */
    @CompileTimeCalculation
    public operator fun div(other: Int): Int
    /** Divides this value by the other value, truncating the result to an integer that is closer to zero. */
    @CompileTimeCalculation
    public operator fun div(other: Long): Long
    /** Divides this value by the other value. */
    @CompileTimeCalculation
    public operator fun div(other: Float): Float
    /** Divides this value by the other value. */
    @CompileTimeCalculation
    public operator fun div(other: Double): Double

    /**
     * Calculates the remainder of truncating division of this value by the other value.
     *
     * The result is either zero or has the same sign as the _dividend_ and has the absolute value less than the absolute value of the divisor.
     */
    @SinceKotlin("1.1")
    @CompileTimeCalculation
    public operator fun rem(other: Byte): Int
    /**
     * Calculates the remainder of truncating division of this value by the other value.
     *
     * The result is either zero or has the same sign as the _dividend_ and has the absolute value less than the absolute value of the divisor.
     */
    @SinceKotlin("1.1")
    @CompileTimeCalculation
    public operator fun rem(other: Short): Int
    /**
     * Calculates the remainder of truncating division of this value by the other value.
     *
     * The result is either zero or has the same sign as the _dividend_ and has the absolute value less than the absolute value of the divisor.
     */
    @SinceKotlin("1.1")
    @CompileTimeCalculation
    public operator fun rem(other: Int): Int
    /**
     * Calculates the remainder of truncating division of this value by the other value.
     *
     * The result is either zero or has the same sign as the _dividend_ and has the absolute value less than the absolute value of the divisor.
     */
    @SinceKotlin("1.1")
    @CompileTimeCalculation
    public operator fun rem(other: Long): Long
    /**
     * Calculates the remainder of truncating division of this value by the other value.
     *
     * The result is either zero or has the same sign as the _dividend_ and has the absolute value less than the absolute value of the divisor.
     */
    @SinceKotlin("1.1")
    @CompileTimeCalculation
    public operator fun rem(other: Float): Float
    /**
     * Calculates the remainder of truncating division of this value by the other value.
     *
     * The result is either zero or has the same sign as the _dividend_ and has the absolute value less than the absolute value of the divisor.
     */
    @SinceKotlin("1.1")
    @CompileTimeCalculation
    public operator fun rem(other: Double): Double

    /**
     * Returns this value incremented by one.
     *
     * @sample samples.misc.Builtins.inc
     */
    public operator fun inc(): Int

    /**
     * Returns this value decremented by one.
     *
     * @sample samples.misc.Builtins.dec
     */
    public operator fun dec(): Int

    /** Returns this value. */
    @CompileTimeCalculation
    public operator fun unaryPlus(): Int
    /** Returns the negative of this value. */
    @CompileTimeCalculation
    public operator fun unaryMinus(): Int

     /** Creates a range from this value to the specified [other] value. */
    public operator fun rangeTo(other: Byte): IntRange
     /** Creates a range from this value to the specified [other] value. */
    public operator fun rangeTo(other: Short): IntRange
     /** Creates a range from this value to the specified [other] value. */
    public operator fun rangeTo(other: Int): IntRange
     /** Creates a range from this value to the specified [other] value. */
    public operator fun rangeTo(other: Long): LongRange

    /**
     * Shifts this value left by the [bitCount] number of bits.
     *
     * Note that only the five lowest-order bits of the [bitCount] are used as the shift distance.
     * The shift distance actually used is therefore always in the range `0..31`.
     */
    @CompileTimeCalculation
    public infix fun shl(bitCount: Int): Int

    /**
     * Shifts this value right by the [bitCount] number of bits, filling the leftmost bits with copies of the sign bit.
     *
     * Note that only the five lowest-order bits of the [bitCount] are used as the shift distance.
     * The shift distance actually used is therefore always in the range `0..31`.
     */
    @CompileTimeCalculation
    public infix fun shr(bitCount: Int): Int

    /**
     * Shifts this value right by the [bitCount] number of bits, filling the leftmost bits with zeros.
     *
     * Note that only the five lowest-order bits of the [bitCount] are used as the shift distance.
     * The shift distance actually used is therefore always in the range `0..31`.
     */
    @CompileTimeCalculation
    public infix fun ushr(bitCount: Int): Int

    /** Performs a bitwise AND operation between the two values. */
    @CompileTimeCalculation
    public infix fun and(other: Int): Int
    /** Performs a bitwise OR operation between the two values. */
    @CompileTimeCalculation
    public infix fun or(other: Int): Int
    /** Performs a bitwise XOR operation between the two values. */
    @CompileTimeCalculation
    public infix fun xor(other: Int): Int
    /** Inverts the bits in this value. */
    @CompileTimeCalculation
    public fun inv(): Int

    /**
     * Converts this [Int] value to [Byte].
     *
     * If this value is in [Byte.MIN_VALUE]..[Byte.MAX_VALUE], the resulting `Byte` value represents
     * the same numerical value as this `Int`.
     *
     * The resulting `Byte` value is represented by the least significant 8 bits of this `Int` value.
     */
    @CompileTimeCalculation
    public override fun toByte(): Byte
    /**
     * Converts this [Int] value to [Char].
     *
     * If this value is in the range of `Char` codes `Char.MIN_VALUE..Char.MAX_VALUE`,
     * the resulting `Char` code is equal to this value.
     *
     * The resulting `Char` code is represented by the least significant 16 bits of this `Int` value.
     */
    @CompileTimeCalculation
    public override fun toChar(): Char
    /**
     * Converts this [Int] value to [Short].
     *
     * If this value is in [Short.MIN_VALUE]..[Short.MAX_VALUE], the resulting `Short` value represents
     * the same numerical value as this `Int`.
     *
     * The resulting `Short` value is represented by the least significant 16 bits of this `Int` value.
     */
    @CompileTimeCalculation
    public override fun toShort(): Short
    /** Returns this value. */
    @CompileTimeCalculation
    public override fun toInt(): Int
    /**
     * Converts this [Int] value to [Long].
     *
     * The resulting `Long` value represents the same numerical value as this `Int`.
     *
     * The least significant 32 bits of the resulting `Long` value are the same as the bits of this `Int` value,
     * whereas the most significant 32 bits are filled with the sign bit of this value.
     */
    @CompileTimeCalculation
    public override fun toLong(): Long
    /**
     * Converts this [Int] value to [Float].
     *
     * The resulting value is the closest `Float` to this `Int` value.
     * In case when this `Int` value is exactly between two `Float`s,
     * the one with zero at least significant bit of mantissa is selected.
     */
    @CompileTimeCalculation
    public override fun toFloat(): Float
    /**
     * Converts this [Int] value to [Double].
     *
     * The resulting `Double` value represents the same numerical value as this `Int`.
     */
    @CompileTimeCalculation
    public override fun toDouble(): Double

    @CompileTimeCalculation
    public override fun toString(): String

    @CompileTimeCalculation
    public override fun equals(other: Any?): Boolean
}

/**
 * Represents a 64-bit signed integer.
 * On the JVM, non-nullable values of this type are represented as values of the primitive type `long`.
 */
public class Long private constructor() : Number(), Comparable<Long> {
    companion object {
        /**
         * A constant holding the minimum value an instance of Long can have.
         */
        public const val MIN_VALUE: Long = -9223372036854775807L - 1L

        /**
         * A constant holding the maximum value an instance of Long can have.
         */
        public const val MAX_VALUE: Long = 9223372036854775807L

        /**
         * The number of bytes used to represent an instance of Long in a binary form.
         */
        @SinceKotlin("1.3")
        public const val SIZE_BYTES: Int = 8

        /**
         * The number of bits used to represent an instance of Long in a binary form.
         */
        @SinceKotlin("1.3")
        public const val SIZE_BITS: Int = 64
    }

    /**
     * Compares this value with the specified value for order.
     * Returns zero if this value is equal to the specified other value, a negative number if it's less than other,
     * or a positive number if it's greater than other.
     */
    @CompileTimeCalculation
    public operator fun compareTo(other: Byte): Int

    /**
     * Compares this value with the specified value for order.
     * Returns zero if this value is equal to the specified other value, a negative number if it's less than other,
     * or a positive number if it's greater than other.
     */
    @CompileTimeCalculation
    public operator fun compareTo(other: Short): Int

    /**
     * Compares this value with the specified value for order.
     * Returns zero if this value is equal to the specified other value, a negative number if it's less than other,
     * or a positive number if it's greater than other.
     */
    @CompileTimeCalculation
    public operator fun compareTo(other: Int): Int

    /**
     * Compares this value with the specified value for order.
     * Returns zero if this value is equal to the specified other value, a negative number if it's less than other,
     * or a positive number if it's greater than other.
     */
    @CompileTimeCalculation
    public override operator fun compareTo(other: Long): Int

    /**
     * Compares this value with the specified value for order.
     * Returns zero if this value is equal to the specified other value, a negative number if it's less than other,
     * or a positive number if it's greater than other.
     */
    @CompileTimeCalculation
    public operator fun compareTo(other: Float): Int

    /**
     * Compares this value with the specified value for order.
     * Returns zero if this value is equal to the specified other value, a negative number if it's less than other,
     * or a positive number if it's greater than other.
     */
    @CompileTimeCalculation
    public operator fun compareTo(other: Double): Int

    /** Adds the other value to this value. */
    @CompileTimeCalculation
    public operator fun plus(other: Byte): Long
    /** Adds the other value to this value. */
    @CompileTimeCalculation
    public operator fun plus(other: Short): Long
    /** Adds the other value to this value. */
    @CompileTimeCalculation
    public operator fun plus(other: Int): Long
    /** Adds the other value to this value. */
    @CompileTimeCalculation
    public operator fun plus(other: Long): Long
    /** Adds the other value to this value. */
    @CompileTimeCalculation
    public operator fun plus(other: Float): Float
    /** Adds the other value to this value. */
    @CompileTimeCalculation
    public operator fun plus(other: Double): Double

    /** Subtracts the other value from this value. */
    @CompileTimeCalculation
    public operator fun minus(other: Byte): Long
    /** Subtracts the other value from this value. */
    @CompileTimeCalculation
    public operator fun minus(other: Short): Long
    /** Subtracts the other value from this value. */
    @CompileTimeCalculation
    public operator fun minus(other: Int): Long
    /** Subtracts the other value from this value. */
    @CompileTimeCalculation
    public operator fun minus(other: Long): Long
    /** Subtracts the other value from this value. */
    @CompileTimeCalculation
    public operator fun minus(other: Float): Float
    /** Subtracts the other value from this value. */
    @CompileTimeCalculation
    public operator fun minus(other: Double): Double

    /** Multiplies this value by the other value. */
    @CompileTimeCalculation
    public operator fun times(other: Byte): Long
    /** Multiplies this value by the other value. */
    @CompileTimeCalculation
    public operator fun times(other: Short): Long
    /** Multiplies this value by the other value. */
    @CompileTimeCalculation
    public operator fun times(other: Int): Long
    /** Multiplies this value by the other value. */
    @CompileTimeCalculation
    public operator fun times(other: Long): Long
    /** Multiplies this value by the other value. */
    @CompileTimeCalculation
    public operator fun times(other: Float): Float
    /** Multiplies this value by the other value. */
    @CompileTimeCalculation
    public operator fun times(other: Double): Double

    /** Divides this value by the other value, truncating the result to an integer that is closer to zero. */
    @CompileTimeCalculation
    public operator fun div(other: Byte): Long
    /** Divides this value by the other value, truncating the result to an integer that is closer to zero. */
    @CompileTimeCalculation
    public operator fun div(other: Short): Long
    /** Divides this value by the other value, truncating the result to an integer that is closer to zero. */
    @CompileTimeCalculation
    public operator fun div(other: Int): Long
    /** Divides this value by the other value, truncating the result to an integer that is closer to zero. */
    @CompileTimeCalculation
    public operator fun div(other: Long): Long
    /** Divides this value by the other value. */
    @CompileTimeCalculation
    public operator fun div(other: Float): Float
    /** Divides this value by the other value. */
    @CompileTimeCalculation
    public operator fun div(other: Double): Double

    /**
     * Calculates the remainder of truncating division of this value by the other value.
     *
     * The result is either zero or has the same sign as the _dividend_ and has the absolute value less than the absolute value of the divisor.
     */
    @SinceKotlin("1.1")
    @CompileTimeCalculation
    public operator fun rem(other: Byte): Long
    /**
     * Calculates the remainder of truncating division of this value by the other value.
     *
     * The result is either zero or has the same sign as the _dividend_ and has the absolute value less than the absolute value of the divisor.
     */
    @SinceKotlin("1.1")
    @CompileTimeCalculation
    public operator fun rem(other: Short): Long
    /**
     * Calculates the remainder of truncating division of this value by the other value.
     *
     * The result is either zero or has the same sign as the _dividend_ and has the absolute value less than the absolute value of the divisor.
     */
    @SinceKotlin("1.1")
    @CompileTimeCalculation
    public operator fun rem(other: Int): Long
    /**
     * Calculates the remainder of truncating division of this value by the other value.
     *
     * The result is either zero or has the same sign as the _dividend_ and has the absolute value less than the absolute value of the divisor.
     */
    @SinceKotlin("1.1")
    @CompileTimeCalculation
    public operator fun rem(other: Long): Long
    /**
     * Calculates the remainder of truncating division of this value by the other value.
     *
     * The result is either zero or has the same sign as the _dividend_ and has the absolute value less than the absolute value of the divisor.
     */
    @SinceKotlin("1.1")
    @CompileTimeCalculation
    public operator fun rem(other: Float): Float
    /**
     * Calculates the remainder of truncating division of this value by the other value.
     *
     * The result is either zero or has the same sign as the _dividend_ and has the absolute value less than the absolute value of the divisor.
     */
    @SinceKotlin("1.1")
    @CompileTimeCalculation
    public operator fun rem(other: Double): Double

    /**
     * Returns this value incremented by one.
     *
     * @sample samples.misc.Builtins.inc
     */
    public operator fun inc(): Long

    /**
     * Returns this value decremented by one.
     *
     * @sample samples.misc.Builtins.dec
     */
    public operator fun dec(): Long

    /** Returns this value. */
    @CompileTimeCalculation
    public operator fun unaryPlus(): Long
    /** Returns the negative of this value. */
    @CompileTimeCalculation
    public operator fun unaryMinus(): Long

     /** Creates a range from this value to the specified [other] value. */
    public operator fun rangeTo(other: Byte): LongRange
     /** Creates a range from this value to the specified [other] value. */
    public operator fun rangeTo(other: Short): LongRange
     /** Creates a range from this value to the specified [other] value. */
    public operator fun rangeTo(other: Int): LongRange
     /** Creates a range from this value to the specified [other] value. */
    public operator fun rangeTo(other: Long): LongRange

    /**
     * Shifts this value left by the [bitCount] number of bits.
     *
     * Note that only the six lowest-order bits of the [bitCount] are used as the shift distance.
     * The shift distance actually used is therefore always in the range `0..63`.
     */
    @CompileTimeCalculation
    public infix fun shl(bitCount: Int): Long

    /**
     * Shifts this value right by the [bitCount] number of bits, filling the leftmost bits with copies of the sign bit.
     *
     * Note that only the six lowest-order bits of the [bitCount] are used as the shift distance.
     * The shift distance actually used is therefore always in the range `0..63`.
     */
    @CompileTimeCalculation
    public infix fun shr(bitCount: Int): Long

    /**
     * Shifts this value right by the [bitCount] number of bits, filling the leftmost bits with zeros.
     *
     * Note that only the six lowest-order bits of the [bitCount] are used as the shift distance.
     * The shift distance actually used is therefore always in the range `0..63`.
     */
    @CompileTimeCalculation
    public infix fun ushr(bitCount: Int): Long

    /** Performs a bitwise AND operation between the two values. */
    @CompileTimeCalculation
    public infix fun and(other: Long): Long
    /** Performs a bitwise OR operation between the two values. */
    @CompileTimeCalculation
    public infix fun or(other: Long): Long
    /** Performs a bitwise XOR operation between the two values. */
    @CompileTimeCalculation
    public infix fun xor(other: Long): Long
    /** Inverts the bits in this value. */
    @CompileTimeCalculation
    public fun inv(): Long

    /**
     * Converts this [Long] value to [Byte].
     *
     * If this value is in [Byte.MIN_VALUE]..[Byte.MAX_VALUE], the resulting `Byte` value represents
     * the same numerical value as this `Long`.
     *
     * The resulting `Byte` value is represented by the least significant 8 bits of this `Long` value.
     */
    @CompileTimeCalculation
    public override fun toByte(): Byte
    /**
     * Converts this [Long] value to [Char].
     *
     * If this value is in the range of `Char` codes `Char.MIN_VALUE..Char.MAX_VALUE`,
     * the resulting `Char` code is equal to this value.
     *
     * The resulting `Char` code is represented by the least significant 16 bits of this `Long` value.
     */
    @Deprecated("Direct conversion to Char is deprecated. Use toInt().toChar() or Char constructor instead.", ReplaceWith("this.toInt().toChar()"))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    @CompileTimeCalculation
    public override fun toChar(): Char
    /**
     * Converts this [Long] value to [Short].
     *
     * If this value is in [Short.MIN_VALUE]..[Short.MAX_VALUE], the resulting `Short` value represents
     * the same numerical value as this `Long`.
     *
     * The resulting `Short` value is represented by the least significant 16 bits of this `Long` value.
     */
    @CompileTimeCalculation
    public override fun toShort(): Short
    /**
     * Converts this [Long] value to [Int].
     *
     * If this value is in [Int.MIN_VALUE]..[Int.MAX_VALUE], the resulting `Int` value represents
     * the same numerical value as this `Long`.
     *
     * The resulting `Int` value is represented by the least significant 32 bits of this `Long` value.
     */
    @CompileTimeCalculation
    public override fun toInt(): Int
    /** Returns this value. */
    @CompileTimeCalculation
    public override fun toLong(): Long
    /**
     * Converts this [Long] value to [Float].
     *
     * The resulting value is the closest `Float` to this `Long` value.
     * In case when this `Long` value is exactly between two `Float`s,
     * the one with zero at least significant bit of mantissa is selected.
     */
    @CompileTimeCalculation
    public override fun toFloat(): Float
    /**
     * Converts this [Long] value to [Double].
     *
     * The resulting value is the closest `Double` to this `Long` value.
     * In case when this `Long` value is exactly between two `Double`s,
     * the one with zero at least significant bit of mantissa is selected.
     */
    @CompileTimeCalculation
    public override fun toDouble(): Double

    @CompileTimeCalculation
    public override fun toString(): String

    @CompileTimeCalculation
    public override fun equals(other: Any?): Boolean
}

/**
 * Represents a single-precision 32-bit IEEE 754 floating point number.
 * On the JVM, non-nullable values of this type are represented as values of the primitive type `float`.
 */
public class Float private constructor() : Number(), Comparable<Float> {
    companion object {
        /**
         * A constant holding the smallest *positive* nonzero value of Float.
         */
        public const val MIN_VALUE: Float = 1.4E-45F

        /**
         * A constant holding the largest positive finite value of Float.
         */
        public const val MAX_VALUE: Float = 3.4028235E38F

        /**
         * A constant holding the positive infinity value of Float.
         */
        public const val POSITIVE_INFINITY: Float = 1.0F/0.0F

        /**
         * A constant holding the negative infinity value of Float.
         */
        public const val NEGATIVE_INFINITY: Float = -1.0F/0.0F

        /**
         * A constant holding the "not a number" value of Float.
         */
        public const val NaN: Float = -(0.0F/0.0F)

        /**
         * The number of bytes used to represent an instance of Float in a binary form.
         */
        @SinceKotlin("1.4")
        public const val SIZE_BYTES: Int = 4

        /**
         * The number of bits used to represent an instance of Float in a binary form.
         */
        @SinceKotlin("1.4")
        public const val SIZE_BITS: Int = 32
    }

    /**
     * Compares this value with the specified value for order.
     * Returns zero if this value is equal to the specified other value, a negative number if it's less than other,
     * or a positive number if it's greater than other.
     */
    @CompileTimeCalculation
    public operator fun compareTo(other: Byte): Int

    /**
     * Compares this value with the specified value for order.
     * Returns zero if this value is equal to the specified other value, a negative number if it's less than other,
     * or a positive number if it's greater than other.
     */
    @CompileTimeCalculation
    public operator fun compareTo(other: Short): Int

    /**
     * Compares this value with the specified value for order.
     * Returns zero if this value is equal to the specified other value, a negative number if it's less than other,
     * or a positive number if it's greater than other.
     */
    @CompileTimeCalculation
    public operator fun compareTo(other: Int): Int

    /**
     * Compares this value with the specified value for order.
     * Returns zero if this value is equal to the specified other value, a negative number if it's less than other,
     * or a positive number if it's greater than other.
     */
    @CompileTimeCalculation
    public operator fun compareTo(other: Long): Int

    /**
     * Compares this value with the specified value for order.
     * Returns zero if this value is equal to the specified other value, a negative number if it's less than other,
     * or a positive number if it's greater than other.
     */
    @CompileTimeCalculation
    public override operator fun compareTo(other: Float): Int

    /**
     * Compares this value with the specified value for order.
     * Returns zero if this value is equal to the specified other value, a negative number if it's less than other,
     * or a positive number if it's greater than other.
     */
    @CompileTimeCalculation
    public operator fun compareTo(other: Double): Int

    /** Adds the other value to this value. */
    @CompileTimeCalculation
    public operator fun plus(other: Byte): Float
    /** Adds the other value to this value. */
    @CompileTimeCalculation
    public operator fun plus(other: Short): Float
    /** Adds the other value to this value. */
    @CompileTimeCalculation
    public operator fun plus(other: Int): Float
    /** Adds the other value to this value. */
    @CompileTimeCalculation
    public operator fun plus(other: Long): Float
    /** Adds the other value to this value. */
    @CompileTimeCalculation
    public operator fun plus(other: Float): Float
    /** Adds the other value to this value. */
    @CompileTimeCalculation
    public operator fun plus(other: Double): Double

    /** Subtracts the other value from this value. */
    @CompileTimeCalculation
    public operator fun minus(other: Byte): Float
    /** Subtracts the other value from this value. */
    @CompileTimeCalculation
    public operator fun minus(other: Short): Float
    /** Subtracts the other value from this value. */
    @CompileTimeCalculation
    public operator fun minus(other: Int): Float
    /** Subtracts the other value from this value. */
    @CompileTimeCalculation
    public operator fun minus(other: Long): Float
    /** Subtracts the other value from this value. */
    @CompileTimeCalculation
    public operator fun minus(other: Float): Float
    /** Subtracts the other value from this value. */
    @CompileTimeCalculation
    public operator fun minus(other: Double): Double

    /** Multiplies this value by the other value. */
    @CompileTimeCalculation
    public operator fun times(other: Byte): Float
    /** Multiplies this value by the other value. */
    @CompileTimeCalculation
    public operator fun times(other: Short): Float
    /** Multiplies this value by the other value. */
    @CompileTimeCalculation
    public operator fun times(other: Int): Float
    /** Multiplies this value by the other value. */
    @CompileTimeCalculation
    public operator fun times(other: Long): Float
    /** Multiplies this value by the other value. */
    @CompileTimeCalculation
    public operator fun times(other: Float): Float
    /** Multiplies this value by the other value. */
    @CompileTimeCalculation
    public operator fun times(other: Double): Double

    /** Divides this value by the other value. */
    @CompileTimeCalculation
    public operator fun div(other: Byte): Float
    /** Divides this value by the other value. */
    @CompileTimeCalculation
    public operator fun div(other: Short): Float
    /** Divides this value by the other value. */
    @CompileTimeCalculation
    public operator fun div(other: Int): Float
    /** Divides this value by the other value. */
    @CompileTimeCalculation
    public operator fun div(other: Long): Float
    /** Divides this value by the other value. */
    @CompileTimeCalculation
    public operator fun div(other: Float): Float
    /** Divides this value by the other value. */
    @CompileTimeCalculation
    public operator fun div(other: Double): Double

    /**
     * Calculates the remainder of truncating division of this value by the other value.
     *
     * The result is either zero or has the same sign as the _dividend_ and has the absolute value less than the absolute value of the divisor.
     */
    @SinceKotlin("1.1")
    @CompileTimeCalculation
    public operator fun rem(other: Byte): Float
    /**
     * Calculates the remainder of truncating division of this value by the other value.
     *
     * The result is either zero or has the same sign as the _dividend_ and has the absolute value less than the absolute value of the divisor.
     */
    @SinceKotlin("1.1")
    @CompileTimeCalculation
    public operator fun rem(other: Short): Float
    /**
     * Calculates the remainder of truncating division of this value by the other value.
     *
     * The result is either zero or has the same sign as the _dividend_ and has the absolute value less than the absolute value of the divisor.
     */
    @SinceKotlin("1.1")
    @CompileTimeCalculation
    public operator fun rem(other: Int): Float
    /**
     * Calculates the remainder of truncating division of this value by the other value.
     *
     * The result is either zero or has the same sign as the _dividend_ and has the absolute value less than the absolute value of the divisor.
     */
    @SinceKotlin("1.1")
    @CompileTimeCalculation
    public operator fun rem(other: Long): Float
    /**
     * Calculates the remainder of truncating division of this value by the other value.
     *
     * The result is either zero or has the same sign as the _dividend_ and has the absolute value less than the absolute value of the divisor.
     */
    @SinceKotlin("1.1")
    @CompileTimeCalculation
    public operator fun rem(other: Float): Float
    /**
     * Calculates the remainder of truncating division of this value by the other value.
     *
     * The result is either zero or has the same sign as the _dividend_ and has the absolute value less than the absolute value of the divisor.
     */
    @SinceKotlin("1.1")
    @CompileTimeCalculation
    public operator fun rem(other: Double): Double

    /**
     * Returns this value incremented by one.
     *
     * @sample samples.misc.Builtins.inc
     */
    public operator fun inc(): Float

    /**
     * Returns this value decremented by one.
     *
     * @sample samples.misc.Builtins.dec
     */
    public operator fun dec(): Float

    /** Returns this value. */
    @CompileTimeCalculation
    public operator fun unaryPlus(): Float
    /** Returns the negative of this value. */
    @CompileTimeCalculation
    public operator fun unaryMinus(): Float


    /**
     * Converts this [Float] value to [Byte].
     *
     * The resulting `Byte` value is equal to `this.toInt().toByte()`.
     */
    @CompileTimeCalculation
    @Deprecated("Unclear conversion. To achieve the same result convert to Int explicitly and then to Byte.", ReplaceWith("toInt().toByte()"))
    @DeprecatedSinceKotlin(warningSince = "1.3", errorSince = "1.5")
    public override fun toByte(): Byte
    /**
     * Converts this [Float] value to [Char].
     *
     * The resulting `Char` value is equal to `this.toInt().toChar()`.
     */
    @Deprecated("Direct conversion to Char is deprecated. Use toInt().toChar() or Char constructor instead.", ReplaceWith("this.toInt().toChar()"))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    @CompileTimeCalculation
    public override fun toChar(): Char
    /**
     * Converts this [Float] value to [Short].
     *
     * The resulting `Short` value is equal to `this.toInt().toShort()`.
     */
    @CompileTimeCalculation
    @Deprecated("Unclear conversion. To achieve the same result convert to Int explicitly and then to Short.", ReplaceWith("toInt().toShort()"))
    @DeprecatedSinceKotlin(warningSince = "1.3", errorSince = "1.5")
    public override fun toShort(): Short
    /**
     * Converts this [Float] value to [Int].
     *
     * The fractional part, if any, is rounded down towards zero.
     * Returns zero if this `Float` value is `NaN`, [Int.MIN_VALUE] if it's less than `Int.MIN_VALUE`,
     * [Int.MAX_VALUE] if it's bigger than `Int.MAX_VALUE`.
     */
    @CompileTimeCalculation
    public override fun toInt(): Int
    /**
     * Converts this [Float] value to [Long].
     *
     * The fractional part, if any, is rounded down towards zero.
     * Returns zero if this `Float` value is `NaN`, [Long.MIN_VALUE] if it's less than `Long.MIN_VALUE`,
     * [Long.MAX_VALUE] if it's bigger than `Long.MAX_VALUE`.
     */
    @CompileTimeCalculation
    public override fun toLong(): Long
    /** Returns this value. */
    @CompileTimeCalculation
    public override fun toFloat(): Float
    /**
     * Converts this [Float] value to [Double].
     *
     * The resulting `Double` value represents the same numerical value as this `Float`.
     */
    @CompileTimeCalculation
    public override fun toDouble(): Double

    @CompileTimeCalculation
    public override fun toString(): String

    @CompileTimeCalculation
    public override fun equals(other: Any?): Boolean
}

/**
 * Represents a double-precision 64-bit IEEE 754 floating point number.
 * On the JVM, non-nullable values of this type are represented as values of the primitive type `double`.
 */
public class Double private constructor() : Number(), Comparable<Double> {
    companion object {
        /**
         * A constant holding the smallest *positive* nonzero value of Double.
         */
        public const val MIN_VALUE: Double = 4.9E-324

        /**
         * A constant holding the largest positive finite value of Double.
         */
        public const val MAX_VALUE: Double = 1.7976931348623157E308

        /**
         * A constant holding the positive infinity value of Double.
         */
        public const val POSITIVE_INFINITY: Double = 1.0/0.0

        /**
         * A constant holding the negative infinity value of Double.
         */
        public const val NEGATIVE_INFINITY: Double = -1.0/0.0

        /**
         * A constant holding the "not a number" value of Double.
         */
        public const val NaN: Double = -(0.0/0.0)

        /**
         * The number of bytes used to represent an instance of Double in a binary form.
         */
        @SinceKotlin("1.4")
        public const val SIZE_BYTES: Int = 8

        /**
         * The number of bits used to represent an instance of Double in a binary form.
         */
        @SinceKotlin("1.4")
        public const val SIZE_BITS: Int = 64
    }

    /**
     * Compares this value with the specified value for order.
     * Returns zero if this value is equal to the specified other value, a negative number if it's less than other,
     * or a positive number if it's greater than other.
     */
    @CompileTimeCalculation
    public operator fun compareTo(other: Byte): Int

    /**
     * Compares this value with the specified value for order.
     * Returns zero if this value is equal to the specified other value, a negative number if it's less than other,
     * or a positive number if it's greater than other.
     */
    @CompileTimeCalculation
    public operator fun compareTo(other: Short): Int

    /**
     * Compares this value with the specified value for order.
     * Returns zero if this value is equal to the specified other value, a negative number if it's less than other,
     * or a positive number if it's greater than other.
     */
    @CompileTimeCalculation
    public operator fun compareTo(other: Int): Int

    /**
     * Compares this value with the specified value for order.
     * Returns zero if this value is equal to the specified other value, a negative number if it's less than other,
     * or a positive number if it's greater than other.
     */
    @CompileTimeCalculation
    public operator fun compareTo(other: Long): Int

    /**
     * Compares this value with the specified value for order.
     * Returns zero if this value is equal to the specified other value, a negative number if it's less than other,
     * or a positive number if it's greater than other.
     */
    @CompileTimeCalculation
    public operator fun compareTo(other: Float): Int

    /**
     * Compares this value with the specified value for order.
     * Returns zero if this value is equal to the specified other value, a negative number if it's less than other,
     * or a positive number if it's greater than other.
     */
    @CompileTimeCalculation
    public override operator fun compareTo(other: Double): Int

    /** Adds the other value to this value. */
    @CompileTimeCalculation
    public operator fun plus(other: Byte): Double
    /** Adds the other value to this value. */
    @CompileTimeCalculation
    public operator fun plus(other: Short): Double
    /** Adds the other value to this value. */
    @CompileTimeCalculation
    public operator fun plus(other: Int): Double
    /** Adds the other value to this value. */
    @CompileTimeCalculation
    public operator fun plus(other: Long): Double
    /** Adds the other value to this value. */
    @CompileTimeCalculation
    public operator fun plus(other: Float): Double
    /** Adds the other value to this value. */
    @CompileTimeCalculation
    public operator fun plus(other: Double): Double

    /** Subtracts the other value from this value. */
    @CompileTimeCalculation
    public operator fun minus(other: Byte): Double
    /** Subtracts the other value from this value. */
    @CompileTimeCalculation
    public operator fun minus(other: Short): Double
    /** Subtracts the other value from this value. */
    @CompileTimeCalculation
    public operator fun minus(other: Int): Double
    /** Subtracts the other value from this value. */
    @CompileTimeCalculation
    public operator fun minus(other: Long): Double
    /** Subtracts the other value from this value. */
    @CompileTimeCalculation
    public operator fun minus(other: Float): Double
    /** Subtracts the other value from this value. */
    @CompileTimeCalculation
    public operator fun minus(other: Double): Double

    /** Multiplies this value by the other value. */
    @CompileTimeCalculation
    public operator fun times(other: Byte): Double
    /** Multiplies this value by the other value. */
    @CompileTimeCalculation
    public operator fun times(other: Short): Double
    /** Multiplies this value by the other value. */
    @CompileTimeCalculation
    public operator fun times(other: Int): Double
    /** Multiplies this value by the other value. */
    @CompileTimeCalculation
    public operator fun times(other: Long): Double
    /** Multiplies this value by the other value. */
    @CompileTimeCalculation
    public operator fun times(other: Float): Double
    /** Multiplies this value by the other value. */
    @CompileTimeCalculation
    public operator fun times(other: Double): Double

    /** Divides this value by the other value. */
    @CompileTimeCalculation
    public operator fun div(other: Byte): Double
    /** Divides this value by the other value. */
    @CompileTimeCalculation
    public operator fun div(other: Short): Double
    /** Divides this value by the other value. */
    @CompileTimeCalculation
    public operator fun div(other: Int): Double
    /** Divides this value by the other value. */
    @CompileTimeCalculation
    public operator fun div(other: Long): Double
    /** Divides this value by the other value. */
    @CompileTimeCalculation
    public operator fun div(other: Float): Double
    /** Divides this value by the other value. */
    @CompileTimeCalculation
    public operator fun div(other: Double): Double

    /**
     * Calculates the remainder of truncating division of this value by the other value.
     *
     * The result is either zero or has the same sign as the _dividend_ and has the absolute value less than the absolute value of the divisor.
     */
    @SinceKotlin("1.1")
    @CompileTimeCalculation
    public operator fun rem(other: Byte): Double
    /**
     * Calculates the remainder of truncating division of this value by the other value.
     *
     * The result is either zero or has the same sign as the _dividend_ and has the absolute value less than the absolute value of the divisor.
     */
    @SinceKotlin("1.1")
    @CompileTimeCalculation
    public operator fun rem(other: Short): Double
    /**
     * Calculates the remainder of truncating division of this value by the other value.
     *
     * The result is either zero or has the same sign as the _dividend_ and has the absolute value less than the absolute value of the divisor.
     */
    @SinceKotlin("1.1")
    @CompileTimeCalculation
    public operator fun rem(other: Int): Double
    /**
     * Calculates the remainder of truncating division of this value by the other value.
     *
     * The result is either zero or has the same sign as the _dividend_ and has the absolute value less than the absolute value of the divisor.
     */
    @SinceKotlin("1.1")
    @CompileTimeCalculation
    public operator fun rem(other: Long): Double
    /**
     * Calculates the remainder of truncating division of this value by the other value.
     *
     * The result is either zero or has the same sign as the _dividend_ and has the absolute value less than the absolute value of the divisor.
     */
    @SinceKotlin("1.1")
    @CompileTimeCalculation
    public operator fun rem(other: Float): Double
    /**
     * Calculates the remainder of truncating division of this value by the other value.
     *
     * The result is either zero or has the same sign as the _dividend_ and has the absolute value less than the absolute value of the divisor.
     */
    @SinceKotlin("1.1")
    @CompileTimeCalculation
    public operator fun rem(other: Double): Double

    /**
     * Returns this value incremented by one.
     *
     * @sample samples.misc.Builtins.inc
     */
    public operator fun inc(): Double

    /**
     * Returns this value decremented by one.
     *
     * @sample samples.misc.Builtins.dec
     */
    public operator fun dec(): Double

    /** Returns this value. */
    @CompileTimeCalculation
    public operator fun unaryPlus(): Double
    /** Returns the negative of this value. */
    @CompileTimeCalculation
    public operator fun unaryMinus(): Double


    /**
     * Converts this [Double] value to [Byte].
     *
     * The resulting `Byte` value is equal to `this.toInt().toByte()`.
     */
    @CompileTimeCalculation
    @Deprecated("Unclear conversion. To achieve the same result convert to Int explicitly and then to Byte.", ReplaceWith("toInt().toByte()"))
    @DeprecatedSinceKotlin(warningSince = "1.3", errorSince = "1.5")
    public override fun toByte(): Byte
    /**
     * Converts this [Double] value to [Char].
     *
     * The resulting `Char` value is equal to `this.toInt().toChar()`.
     */
    @Deprecated("Direct conversion to Char is deprecated. Use toInt().toChar() or Char constructor instead.", ReplaceWith("this.toInt().toChar()"))
    @DeprecatedSinceKotlin(warningSince = "1.5")
    @CompileTimeCalculation
    public override fun toChar(): Char
    /**
     * Converts this [Double] value to [Short].
     *
     * The resulting `Short` value is equal to `this.toInt().toShort()`.
     */
    @CompileTimeCalculation
    @Deprecated("Unclear conversion. To achieve the same result convert to Int explicitly and then to Short.", ReplaceWith("toInt().toShort()"))
    @DeprecatedSinceKotlin(warningSince = "1.3", errorSince = "1.5")
    public override fun toShort(): Short
    /**
     * Converts this [Double] value to [Int].
     *
     * The fractional part, if any, is rounded down towards zero.
     * Returns zero if this `Double` value is `NaN`, [Int.MIN_VALUE] if it's less than `Int.MIN_VALUE`,
     * [Int.MAX_VALUE] if it's bigger than `Int.MAX_VALUE`.
     */
    @CompileTimeCalculation
    public override fun toInt(): Int
    /**
     * Converts this [Double] value to [Long].
     *
     * The fractional part, if any, is rounded down towards zero.
     * Returns zero if this `Double` value is `NaN`, [Long.MIN_VALUE] if it's less than `Long.MIN_VALUE`,
     * [Long.MAX_VALUE] if it's bigger than `Long.MAX_VALUE`.
     */
    @CompileTimeCalculation
    public override fun toLong(): Long
    /**
     * Converts this [Double] value to [Float].
     *
     * The resulting value is the closest `Float` to this `Double` value.
     * In case when this `Double` value is exactly between two `Float`s,
     * the one with zero at least significant bit of mantissa is selected.
     */
    @CompileTimeCalculation
    public override fun toFloat(): Float
    /** Returns this value. */
    @CompileTimeCalculation
    public override fun toDouble(): Double

    @CompileTimeCalculation
    public override fun toString(): String

    @CompileTimeCalculation
    public override fun equals(other: Any?): Boolean
}

