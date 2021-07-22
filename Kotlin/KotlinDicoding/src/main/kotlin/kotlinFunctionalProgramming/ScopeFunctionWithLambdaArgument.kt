package kotlinFunctionalProgramming

fun main() {
    /*
        let function
        We can prefer use let than use:
        val message: String? = null
        val length = message?.length ?: 0 * 2
        val text = "text length $length"
        println(text)
    */
    val message: String? = null
    message?.let {
        val length = it.length * 2
        val text = "text length $length"
        println(text)
    } ?: run {
        val text = "message is null"
        println(text)
    }

    /*
        also function same with apply function.

        also function is good to use when the context of the object only used
        as an argumen without change it's value.
     */
    val text = "Hello Kotlin!"
    val result = text.also{
        println("Value length -> ${it.length}")
    }

    println("text -> $result")
}