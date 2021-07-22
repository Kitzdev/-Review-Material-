package kotlinObjectOrientedProgramming

fun main() {
    /*
        Below code will make ArithmeticException

        val someValue = 6
        pritnln(someValue / 0)
     */

    /*
        Below code will make NumberFormatException

        val someStringValue = 18.0
        pritnln(someStringValue.toInt())
     */

    /*
        Below code will make NullPointerException

        val someNullValue: String? = null
        val someMostNotNullValue: String = someNullValue!!
        println(someMostNotNullValue)
     */
}