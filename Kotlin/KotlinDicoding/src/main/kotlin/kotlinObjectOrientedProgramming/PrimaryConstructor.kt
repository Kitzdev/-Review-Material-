package kotlinObjectOrientedProgramming

//Primary Constructor
class Animal6(val name: String, val weight: Double, val age: Int = 0, val
isMammal: Boolean =  true)

class Animal7(name: String, weight: Double, age: Int, isMammal: Boolean) {
    val name: String
    val weight: Double
    val age: Int
    val isMammal: Boolean

    /*
        init block will automatically run when an object created within
        primary  constructor.
     */

    init {
        this.name = name
        this.weight = if(weight < 0) 0.0 else weight
        this.age = if(age < -0) 0 else age
        this.isMammal = isMammal
    }
}
fun main() {
    val dicodingCat = Animal6("Dicoding Miaw", 4.2)

    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: " +
            "${dicodingCat.age}, Mammal: ${dicodingCat.isMammal}")
}