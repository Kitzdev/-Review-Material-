package kotlinFunctionalProgramming

/*
    vararg used when we don't know how much argument will be inserted to the
    function
 */
fun sumNumbers(vararg number: Int): Int{
    return number.sum()
}

/*
    When the parameter was declared as a vararg, we can implement Generic to
    the type of parameter.
 */
fun <T> asList(vararg input: T): List<T>{
    val result = ArrayList<T>()

    for(item in input){
        result.add(item)
    }

    return result
}

/*
    When a parameter was declared as a vararg, all of the value that inserted
    to the function will be stored in Array<T>. As we can see, number can use
    .size because it was an Array<T>.
 */
fun getNumberSize(vararg number: Int): Int{
    return number.size
}

/*
    A function only can have one vararg parameter and it recommended to
    declared as the first parameter of a function.
 */
fun sets(vararg number: Int, name: String):Int{
    return number.size
}

/*
    A function with Array<T> parameter, only can be called by passing
    variable with type of array
 */
fun test(number: Array<Int>): Int{
    return number.size
}

fun main(){
    val number= sumNumbers(10, 20, 30, 40, 50, 60)
    println(number)

    /*
        We must use named argument when call a function that has a vararg as
        the first argument
     */
    println(sets(10, 10, name = "Kotlin"))

    val arrayOfInt = arrayOf(10, 20, 30, 40, 50)
    println(test(arrayOfInt))

    val arrayInt = intArrayOf(10, 20, 30, 40, 50)

    /*
        Use ("*" --> Spread Operator) to pass an array to a function with
        vararg parameter
     */
    println(getNumberSize(10, 20, 30, *arrayInt, 40, 50))
}