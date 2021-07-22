package kotlinObjectOrientedProgramming

/*
    In Kotlin, a properties will be automatically has a getter() and setter()
     if the properties is a mutable and if the properties is read-only, the
     properties will automatically has a getter() only.

    In Kotlin, we can also override the getter() and setter() if we need.
 */

//in get() we need to return a value or we can use the "field" keyword
class Animal2 {
    var name: String = "Dicoding Miaw"
        get(){
            println("Fungsi Getter terpanggil")
            return field
        }
        set(value){
            println("Fungsi Setter terpanggil")
            field = value
        }
}

fun main() {
    val dicodingCat = Animal2()
    println("Name: ${dicodingCat.name}")
    dicodingCat.name = "Goose"
    println("Name: ${dicodingCat.name}")
}