package kotlinFunctionalProgramming

/*
    Extension Function
    "Int" is a receiver type
    "printInt" is the name of the extension
 */
fun Int.printInt(){
    print("Value $this")
}

fun Int.plusThree(): Int {
    return this + 3
}

/*
    Extension Properties
    "Int" is a receiver type
    "slice" is the name of the extension
 */
val Int.slice: Int
    get() = this / 2

/*
    Extension with nullable receiver
 */
val Int?.slice2: Int
    get() = this?.div(2) ?: 0

fun main(){
    10.printInt()
    println(2.plusThree())
    println(10.slice)

    val value: Int? = null
    val value1: Int? = null

    println(value?.slice)
    println(value1?.slice)

    println(value.slice2)
    println(value1.slice2)
}