package dataClassesAndCollection

fun main(){
    val list: List<Int> = listOf(1, 2, 3, 4, 5)
    val numberList = listOf(1, 2, 3, 4, 5)
    val charList = listOf('a', 'b', 'c')
    val anyList = listOf('a', "Kotlin", 3, true)

    println(anyList[3])

    val mutableList = mutableListOf('a', "Kotlin", 3, true)
    mutableList.add('d')
    mutableList.add(1, "Love")
    mutableList[3] = false
    mutableList.removeAt(1)
}