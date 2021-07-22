package kotlinFundamental

fun main()
{
    /*
        Rounded number
        Byte = 8 bit
        Short = 16 bit
        Int = 32 bit
        Long = 64 bit

        Floating Point
        Float = 32 bit
        Double = 64 bit
     */

    val maximumInt = Int.MAX_VALUE
    val minimumInt = Int.MIN_VALUE
    val overRangeint = Int.MAX_VALUE + 1
    val longNUmber: Long = 100L
    val readableNumber = 100_000_000

    println(maximumInt)
    println(minimumInt)
    println(overRangeint)

    /*
        Casting Function
        toByte(): Byte
        toShort(): Short
        toInt(): Int
        toLong(): Long
        toFloat(): Float
        toDouble(): Double
        toChar(): Char
     */

    val stringNumber = "255"
    println(stringNumber.toInt())
}