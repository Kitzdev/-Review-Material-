package kotlinObjectOrientedProgramming

/*
    Public means the object can be accessed from everywhere. By default, all
    object in Kotlin has public modifier.

    Private means the object only can accessed from the same scope.

    Protected means the object only can accessed by the class hirarchy (child
     and the class it self).

    Internal means the object only can accessed from the same modul.
 */

//Public modifier
class Animal10(val name: String, val weight: Double, val age: Int, val
isMammal: Boolean = true)

//Private modifier
class Animal11(private var name: String, private val weight: Double, private
val age: Int, private val isMammal: Boolean) {

    fun getName() : String {
        return this.name
    }

    fun setName(name : String) {
        this.name = name
    }
}

//Protected modifier
open class Animal12(val name: String, protected val weight: Double)

class Cat(pName: String, pWeight: Double) : Animal12(pName, pWeight)

//Internal modifier
internal class Animal13(val name: String)

fun main() {
    val dicodingCat = Animal10("Dicoding Miaw", 2.5, 2)
    /*
        Auto complete suggest all of the properties of object with Animal10
        type.

        dicodingCat.
     */

    var dicodingCat2 = Animal11("Dicoding Miaw", 2.5, 5, true)
    println(dicodingCat2.getName())
    dicodingCat2.setName("Goose")
    println(dicodingCat2.getName())

    val cat = Cat("Dicoding Miaw", 2.0)
    println("Nama Kucing: ${cat.name}")
    //println("Berat Kucing: ${cat.weight}")
    // Cannot access 'weight': it is protected in Cat
}