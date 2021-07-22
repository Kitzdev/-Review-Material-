package kotlinFunctionalProgramming

data class Item(val key: String, val value: Any)

fun main() {
    /*
        slice() used to filter a collection in a certain position.

        slice() argument take range as an argument.
        The range used to determine the position of first item and the

        position of last item want to be filtered.
     */
    val index = listOf(2, 3, 5, 8)
    val total = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val slice = total.slice(3..6)
    val slice2 =  total.slice(3..6 step 2)
    val slice3 = total.slice(index)

    println(slice)
    println(slice2)
    println(slice3)

    /*
        distinct() used to filter item that has the same value.

        distinctBy() used to filter item that has the same condition.
     */
    val total2 = listOf(1, 2, 1, 3, 4, 5, 2, 3, 4, 5)
    val distinct = total.distinct()

    println(distinct)
    
    val items = listOf(
        Item("1", "Kotlin"),
        Item("2", "is"),
        Item("3", "Awesome"),
        Item("4", "as"),
        Item("5", "Programming"),
        Item("6", "Language")
    )
    val distinctItems = items.distinctBy { it.key }

    distinctItems.forEach{
        println("${it.key} with value ${it.value}")
    }

    val text = listOf("A", "BB", "CC", "D", "EEE", "F", "GGGG")
    val distinct2 = text.distinctBy{
        it.length
    }
    println(distinct)

    /*
        chunked() can be used to split String into small part and stored as
        an Array.

        chunked() was ame like split() but split() need RegEx as the argument
         while chunked() need a value to determine the length of every part.
     */
    val word = "QWERTY"
    val chunked = word.chunked(3)
    val chunkedAndTransform = word.chunked(3){
        it.toString().toLowerCase()
    }

    println(chunked)
    println(chunkedAndTransform)
}