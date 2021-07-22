package controlFlow

fun main(){
    val value = 7
    val stringOfValue = when(value){
        6 -> {
            println("Six")
            "Value is 6"
        }
        7 -> {
            println("Seven")
            "Value is 7"
        }
        8 -> {
            println("Eight")
            "Value is 8"
        }
        else -> {
            println("Unidentified")
            println("Value cannot be reached")
        }
    }

    println(stringOfValue)

    val anyType: Any = 100L

    when(anyType){
        is Long -> println("The value has a long type")
        is String -> println("The value has a string type")
        else -> println("Unidentified")
    }

    val anotherValue = 27
    val ranges = 10..50

    //Since Kotlin 1.3, we can save the return of when expression in a variable
    val answer = when(value)
    {
        in ranges -> "Value is in the range"
        !in ranges -> "Values is not in the range"
        else -> "value unidentified"
    }
}