package kotlinFunctionalProgramming

//Lambda with receiver
fun buildString(action: StringBuilder.() -> Unit): String {
    val stringBuilder = StringBuilder()
    stringBuilder.action()
    return stringBuilder.toString()
}

fun main() {
    val message = buildString {
        append("Hello")
        append("From")
        append("Lambda")
    }

    println(message)
}