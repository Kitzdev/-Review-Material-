package dataClassesAndCollection

fun main(){
    val integerSet = setOf(1, 2, 3, 4, 1, 2, 5)
    println(integerSet)

    val setA = setOf(1, 2, 4, 2, 1, 5)
    val setB = setOf(1, 2, 4, 5)

    println(setA == setB)
    println(1 in setA)

    val setC = setOf(1, 5, 7)
    val union = setA.union(setC)
    val intersect = setA.intersect(setC)

    println(setA)
    println(setB)

    val mutableSet = mutableSetOf(1, 2, 4, 2, 1, 5)
    //mutableSet[2] = 6 --> Error
    mutableSet.add(6)
    mutableSet.remove(1)
}