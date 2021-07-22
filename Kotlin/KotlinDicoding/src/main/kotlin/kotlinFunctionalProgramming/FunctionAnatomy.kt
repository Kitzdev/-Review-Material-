package kotlinFunctionalProgramming

/*
    "private fun sum(valueA: Int, valueB: Int): Int" is called function header.

    "private" is called visibilty modifier.

    "fun sum" is called function name. "fun" is a sign that the line is a
    function declaration. A function name is written in camelCase.

    "(valueA: Int, valueB: Int)" is called function parameter.

    ": Int" is called function return type. All function actually return a
    value. When a function return type is not declared, it will implicitly
    has a Unit return type.

    Anything between the curly bracket called function body
 */
private fun sum(valueA: Int,  valueB: Int): Int{
    return valueA + valueB
}

fun main(){

}