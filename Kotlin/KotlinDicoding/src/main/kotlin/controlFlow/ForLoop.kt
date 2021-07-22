package controlFlow

fun main(){
    val ranges = 1..5
    for(i in ranges){
        println("Value is $i!")
    }

    val anotherRanges = 1.rangeTo(5)
    for(i in anotherRanges){
        println("Value is $i!")
    }

    for((index, value) in ranges.withIndex()){
        println("Value $value with index $index")
    }

    ranges.forEach{value -> println("Value is $value")}
    ranges.forEachIndexed{index, value -> println("Value $value with index" +
    "$index")}
    ranges.forEachIndexed{index, _ -> println("Index $index")}


}