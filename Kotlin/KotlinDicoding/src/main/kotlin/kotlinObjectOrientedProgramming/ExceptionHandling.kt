package kotlinObjectOrientedProgramming

import kotlin.NumberFormatException

fun main() {
    val someNullValue: String? = null
    lateinit var someMustNotNullValue: String
    var someIntValue: Int = 0

    try {
        someMustNotNullValue = someNullValue!!
        println(someMustNotNullValue)
    } catch (e: Exception) {
        someMustNotNullValue = "Nilai String Null"
        println(someMustNotNullValue)
    } finally {
        println(someMustNotNullValue)
    }

    try {
        someMustNotNullValue = someNullValue!!
    } catch (e: NullPointerException) {
        someIntValue = 0
    } catch (e: NumberFormatException) {
        someIntValue = -1
    } finally {
        when(someIntValue) {
            0 -> println("NullPointerException terpanggil!")
            -1 -> println("NumberFormatException terpanggil!")
        }
    }

}
