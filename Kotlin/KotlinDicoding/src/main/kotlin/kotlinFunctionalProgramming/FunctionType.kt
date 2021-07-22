package kotlinFunctionalProgramming

typealias Arithmethic = (Int, Int) -> Int

val sum: Arithmethic = {valueA, valueB -> valueA + valueB}

val multiply: Arithmethic = {valueA, valueB -> valueA * valueB}

typealias ArithmethicNullable = ((Int, Int) -> Int)?

val sumNullable: ArithmethicNullable = {valueA, valueB -> valueA + valueB}

fun main() {
    val sumResult = sum.invoke(10, 10)
    val multiplyResult = multiply(20, 10)

    val sumResultNullable = sumNullable?.invoke(10, 20)
}