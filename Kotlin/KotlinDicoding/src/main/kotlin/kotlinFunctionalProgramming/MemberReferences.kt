package kotlinFunctionalProgramming

//Function type reference with :: operator
val sum2: (Int, Int) -> Int = ::count

fun count(valueA: Int, valueB: Int): Int{
    return valueA + valueB
}

fun isEvenNumber(number: Int) = number % 2 == 0

//Extension function reference
fun Int.isEvenNumber2() = this % 2 == 0

//Property reference
val message2 = "Kotlin"

fun main(){
    val numbers = 1.rangeTo(10)
    val evenNumbers = numbers.filter(::isEvenNumber)
    val evenNumbers2 = numbers.filter(Int::isEvenNumber2)

    println(evenNumbers)
    println(evenNumbers2)

    println(::message2.name)
    println(::message.get())
    //println(::message.set("Kotlin Academy"))
}