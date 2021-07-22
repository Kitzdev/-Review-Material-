package kotlinObjectOrientedProgramming

/*
    We cannot create an object from abstract class.
 */
abstract class Animal16(var name: String, var weight: Double, var age: Int,
                        var isCarnivore: Boolean) {
    fun eat() {
        println("$name sedang makan!")
    }

    fun sleep() {
        println("$name sedang tidur!")
    }
}

fun main() {
}