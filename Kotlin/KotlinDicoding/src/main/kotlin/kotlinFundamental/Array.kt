package kotlinFundamental

fun main()
{
    val array = arrayOf(1, 2, 3, 5)
    val mixArray = arrayOf(1, 3, 5, 7, "Dicoding", true)

    /*
        We can declare an array type of primitive data type.

        intArrayOf(): IntArray
        booleanArrayOf(): BooleanArray
        charArrayOf(): CharArray
        longArrayOf(): LongArray
        shortArrayOf(): ShortArray
        byteArrayOf(): ByteArray
     */

    val intArray = intArrayOf(1, 2, 3, 4, 5)
    println("Second item of intArray: " + intArray[1])

    intArray[1] = 4
    println("Second item of intArray: " + intArray[1])

    //{i -> i * i} --> Lambda Function
    val anotherIntArray = Array(4, {i -> i * i})
}