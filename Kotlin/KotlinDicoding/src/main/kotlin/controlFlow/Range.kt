package controlFlow

fun main(){
    val rangeInt = 1..10
    print(rangeInt.step)

    val anotherRangeInt = 1..20 step 2
    anotherRangeInt.forEach{
        print("$it ")
    }
    println(rangeInt.step)

    val theAnotherRangeInt = 1.rangeTo(10)
    val downInt = 10.downTo(1)

    /*
        Below code is the same with:
        if(7 >= 10 && 7 <= 10)
        {
            println("7 is in the range")
        }
     */
    if(7 in downInt){
        println("7 is in the range")
    }

    val rangeChar = 'A'.rangeTo('F')
}