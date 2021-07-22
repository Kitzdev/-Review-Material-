package kotlinObjectOrientedProgramming

class Animal5(var name: String, var weight: Double, var age: Int, var
isMammal: Boolean)

val Animal5.getAnimalInfo: String
    get() = "Nama: ${this.name}, Berat: ${this.weight}, Umur: ${this.age}, " +
            "Mamalia: ${this.isMammal}"

fun main() {
    val dicodingCat = Animal5("Dicoding Miaw", 5.0, 2, true)
    println(dicodingCat.getAnimalInfo)
}