package kotlinObjectOrientedProgramming

class Animal(
    val name: String,
    val weight: Double,
    val age: Int,
    val isMammal: Boolean
) {
    fun eat(){
        println("$name makan!")
    }

    fun sleep(){
        println("$name tidur!")
    }
}

/*
    val nameOfObject = NameOfClass([property1], [property2])

    val or var determine the type of variable wether it is mutable or read-only.

    nameOfObject is the name of the object we want to create.

    = mean we want to initialize the variable (in the left side) with a class
     (int the right side)

     NameOfClass means the class of the object we want to create.

     ( .. ) primary constructor of the class.
 */
fun main(){
    val dicodingCat = Animal("Dicoding Miaw", 4.2, 2, true)
    println("Name: ${dicodingCat.name}\nWeight: ${dicodingCat.weight}\nAge: " +
            "${dicodingCat.age}\nIs Mamalia? ${dicodingCat.isMammal}")

    dicodingCat.eat()
    dicodingCat.sleep()
}