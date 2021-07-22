package kotlinGenerics

interface List<T> {
    operator fun get(index: Int) : T
}

/*
    This class use Long as the argument type, so function inside the class
    will also use Long as it's default type.
 */
class LongList : List<Long> {
    override fun get(index: Int): Long {
        return this[index]
    }
}

/*
    When we initialize an object from this class, we need to declare the
    argument type of the class.
 */
class ArrayList<T> : List<T> {
    override fun get(index: Int): T {
        return this[index]
    }
}

// Not only 'T' we can use other character such as:
interface List2<P> {
    operator fun get(index: Int): P
}

fun main() {
    /*
        Generic can be applied by placing a parameter type into angle
        brackets (<>). For example:

        interface List<T> {
            operator fun get(index: Int) : T
        }

        'T' means a regular type that return back type of a function.
     */

    val longArrayList = ArrayList<Long>()
    val firstLong = longArrayList.get(0)
}