package kotlinObjectOrientedProgramming

class Animal8(name: String, weight: Double, age: Int) {
    val name: String
    val weight: Double
    val age: Int
    val isMammal: Boolean

    /*
        If an object create by us 3 parameter, the primary constructor will
        be used and this init block will run.
     */
    init {
        this.name = name
        this.weight = weight
        this.age = age
        this.isMammal = false
    }

    /*
        If an object created by use 4 parameter, this second constructor will
        be run.
     */
    constructor(name: String, weight: Double, age: Int, isMammal: Boolean) :
                this(name, weight, age) {
        this.isMammal
    }
}

//Class with default constructor
class Animal9 {
    val name: String = "Dicoding Miaw"
    val weight: Double = 4.2
    val age: Int = 2
    val isMammal: Boolean = true
}

fun main() {
    val dicodingCat = Animal9()
    println("Nama: ${dicodingCat.name}\nBerat: ${dicodingCat.weight}\nUmur: " +
            "${dicodingCat.age}\nMammal: ${dicodingCat.isMammal}")
}