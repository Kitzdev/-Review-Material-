package dataClassesAndCollection

fun main(){
    //Sequences is a collection that categorized in lazy evaluation

    val list = (1..1000000).toList()
    list.asSequence().filter { it % 5 ==0 }.map { it + it }.forEach {
        println(it) }

    val sequenceNumber = generateSequence(1) { it + 1 }
    sequenceNumber.take(5).forEach { print("%it ") }

}