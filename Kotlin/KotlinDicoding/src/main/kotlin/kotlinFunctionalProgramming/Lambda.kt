package kotlinFunctionalProgramming

val message =  { println("Hello from lambda") }

val printMessage = { message: String -> println(message)}

fun main() {
    message()
    printMessage("Hello from lambda!")
}