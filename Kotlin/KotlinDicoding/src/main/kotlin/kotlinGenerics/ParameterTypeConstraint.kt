package kotlinGenerics

/*
    The class below means we can only insert Number parameter type.
 */
class ListNumber<T: Number>: List<T> {
    override fun get(index: Int): T {
        return this[index]
    }
}

/*
    The function below only available at List that has parameter type that
    has Number supertype
 */
fun <T: Number> List<T>.sumNumber() : T {
    return this[0]
}

fun main() {

}