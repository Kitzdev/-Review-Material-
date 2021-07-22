package kotlinObjectOrientedProgramming

class Animal15(private var name: String) {
    fun eat() {
        println("$name makan!")
    }

    fun eat(typeFood: String) {
        println("$name memakan $typeFood!")
    }

    fun eat(typeFood: String, quantity: Double) {
        println("$name memakan $typeFood sebanyak $quantity grams!")
    }

    fun sleep() {
        println("$name tidur!")
    }
}

class Calculator {
    fun add(value1: Int, value2: Int) = value1 + value2
    fun add(value1: Int, value2: Int, value3: Int) = value1 + value2 + value3
    fun add(value1: Float, value2: Float) = value1 + value2
    fun add(value1: Double, value2: Double) = value1 + value2

    fun min(value1: Int, value2: Int) = if(value1 < value2) value1 else value2
    fun min(value1: Double, value2: Double) = if(value1 < value2) value1 else
        value2
}

fun main() {
    val dicodingCat = Animal15("Dicoding Miaw")

    dicodingCat.eat()
    dicodingCat.eat("Ikan Tuna")
    dicodingCat.eat("Ikan Tuna", 450.0)

    val calculator = Calculator()

    println(calculator.add(4, 5))
    println(calculator.add(2.4, 2.5))
    println(calculator.add(6f, 7f))
    println(calculator.add(1, 2 ,3))

    println(calculator.min(4, 3))
    println(calculator.min(17.2, 18.3))
}