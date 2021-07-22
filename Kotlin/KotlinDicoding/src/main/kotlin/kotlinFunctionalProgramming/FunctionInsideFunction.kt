package kotlinFunctionalProgramming

import kotlin.IllegalArgumentException

/*
    Function in Kotlin can be declared anywhere, even inside a function.

    For Example:

    fun sum(valueA: Int, valueB: Int, valueC: Int): Int {
        if(valueA == 0){
            throw IllegalArgumentException("valueA must be bigger than 0")
        }

        if(valueB == 0){
            throw IllegalArgumentException("valueB must be bigger than 0")
        }

        if(valueC == 0){
            throw IllegalArgumentException("valueC must be bigger than 0")
        }

        return valueA + valueB + valueC
    }

    Above code can be simplifies to:
 */
fun sum(valueA: Int, valueB: Int, valueC: Int): Int {
    fun validateNumber(value: Int){
        if(value == 0){
            throw IllegalArgumentException("value must be bigger than 0")
        }
    }

    validateNumber(valueA)
    validateNumber(valueB)
    validateNumber(valueC)

    return valueA + valueB + valueC
}

//We can also make inner function as extensions function
fun sum2(valueA: Int, valueB: Int, valueC: Int): Int {
    fun Int.validateNumber() {
        if(this == 0) {
            throw IllegalArgumentException("Value must be be bigger than 0")
        }
    }

    valueA.validateNumber()
    valueB.validateNumber()
    valueC.validateNumber()

    return valueA + valueB + valueC
}

fun main() {

}