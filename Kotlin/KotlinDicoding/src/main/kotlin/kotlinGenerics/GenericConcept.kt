package kotlinGenerics

fun main() {
    val contributor = listOf<String>("jasoet", "alfian", "nrohmen", "dimas")
    /*
        Actually, we need to specify the data type of list like above, but
        because Kotlin's compiler can detect the type of an Object, we can
        just make a list like below.
    */
    val contributor1 = listOf("jasoet", "alfian", "nrohmen", "dimas", "widy")

    /*
        But, when the list is not initialized, the compiler can't detect the
        type of the list and it will cause an error.
    */

    //val contributor2 = listOf() -->  will cause an error
    val contributor3 = listOf("jasoet")

    /*
        We can also declare a class with more than one type.
     */

    val points = mapOf<String, Int>("alfian" to 10, "dimas" to 20)
}