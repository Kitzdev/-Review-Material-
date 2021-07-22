package kotlinFunctionalProgramming

fun main(){
    /*
        Lambda receiver (this)
        Function that use lambda receiver is run, with, and apply.

        When we want to access the context, we can not write down the "this"
        keyword. But the weakness is we cannot differentiate between object
        receiver and object outside the function.
     */

    val buildString = StringBuilder().apply{
        append("Hello ")
        append("Kotlin ")
    }

    /*
        Lambda argument (it)
        Function that use lambda argument is let and also.

        Value from lambda argument, can we reproduce or initialized to
        another variable.
     */

    val text = "Hello"
    text.let {
        val message = "$it Kotlin"
        println(message)
    }

    val otherText = "Hello"
    otherText.let {
        value -> val message = "$value Kotlin"
        println(message)
    }
}