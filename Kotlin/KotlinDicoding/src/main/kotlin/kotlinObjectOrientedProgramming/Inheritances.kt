package kotlinObjectOrientedProgramming

//  class ChildClass: ParentClass {  }

open class Animal14(val name: String, val weight: Double, val age: Int, val
isCarnivore: Boolean) {

    open fun eat(){
        println("$name sedang makan!")
    }

    open fun sleep(){
        println("$name sedang tidur!")
    }
}

//Example of Inheritance
class Cat2(pName: String, pWeight: Double, pAge: Int, pIsCarnivore: Boolean,
          val furColor: String, val numberOfFeet: Int): Animal14(pName,
    pWeight, pAge, pIsCarnivore) {

    fun playWithHuman() {
        println("$name bermain bersama manusia!")
    }

    override fun eat() {
        println("$name sedang makan ikan!")
    }

    override fun sleep() {
        println("$name sedang tidur di bantal!")
    }
}

fun main() {
    val dicodingCat = Cat2("Dicoding Miaw", 3.2, 2, true, "Brown", 4)

    //We also can access the property of its super class
    dicodingCat.playWithHuman()
    dicodingCat.eat()
    dicodingCat.sleep()
}