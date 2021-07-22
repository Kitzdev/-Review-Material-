package kotlinFunctionalProgramming

//Recursion
fun factorial(n: Int): Int {
    return if(n == 1){
        n
    } else {
        n * factorial(n - 1)
    }
}

//Tail Recursion
tailrec fun tailFactorial(n: Int, result: Int = 1): Int {
    val newResult = n * result

    return if(n == 1) {
        newResult
    } else {
       tailFactorial(n - 1, newResult)
    }
}
fun main(){

}