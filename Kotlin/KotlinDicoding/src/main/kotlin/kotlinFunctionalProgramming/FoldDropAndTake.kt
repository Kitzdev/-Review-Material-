package kotlinFunctionalProgramming

fun main() {
    /*
        Fold, Drop, and Take is a function of that used to manipulate Kotlin
        Collection
     */

    /*
        fold() used to process all of the item in the Collections without using
         any looping.

        fold function use two argument that used to as the initial value and
        lambda expression that it's return value used to be the next initial
        value.

        foldRight() is the same with fold(), but the process start from the
        last index.
     */

    val numbers = listOf(1, 2, 3, 4, 5)
    val fold = numbers.fold(10) {current, item ->
        println("Current $current")
        println("Item $item")
        println()
        current + item
    }
    val foldRight = numbers.foldRight(10) {item, current ->
        println("Current $current")
        println("Item $item")
        println()
        item + current
    }

    /*
       drop() function used to trim item in the collection. drop() has one
       parameter that determine how many item want to be trimmed.
    */
    val drop = numbers.drop(3)
    val dropLast = numbers.dropLast(3)

    println(drop)
    println(dropLast)

    /*
        take() function used to grab item int the collection. take() has one
        parameter that determine how many item want be grabbed?
     */
    val take = numbers.take(3)
    val takeLast = numbers.takeLast(3)

    println(take)
    println(takeLast)
}