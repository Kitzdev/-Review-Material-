package kotlinFunctionalProgramming

/*
    "theSum" is the name of lambda function
    "(Int)" is the parameter of the lambda function
    "Int" is the return value of the lambda function
 */
var theSum: (Int) -> Int = { value -> value + value }

/*
    Higher-Order function is a function that use another function as it's
    parameter
 */
fun printResult(value: Int, theSum: (Int) -> Int) {
    val result = theSum(value)
    println(result)
}

fun main() {
    printResult(10, theSum)
}