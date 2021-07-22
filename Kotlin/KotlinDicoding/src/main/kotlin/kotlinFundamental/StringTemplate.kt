package kotlinFundamental

fun main()
{
    val name = "Kotlin"
    val age = 11
    println("My name is " + name)
    println("My name is $name")
    println("My name is $name, I am $age years old")
    println("I am ${if (age >= 10) "age years old" else " a kid"}")
}
