package kotlinGenerics

/*
    public fun <T> List<T>.slice(indices: Iterable<Int>): List<T> {

    }

    Parameter type in slice() above used as the receiver and return type.
    When that function is called by a list, we can decide the argument type
    specifically.
 */

fun main() {
    val numbers = (1..100).toList()
    //println(numbers.slice<Int>(1..10))

    //If all value inside it have the same type, we can simplify it become:
    println(numbers.slice(1..10))
}