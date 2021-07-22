package kotlinObjectOrientedProgramming

interface IFly {
    fun fly()
    val numberOfWings: Int
}

class Bird(override val numberOfWings: Int): IFly {
    override fun fly() {
        if(numberOfWings > 0) println("I flying without wings")
        else println("I'm flying with $numberOfWings wings")
    }
}

fun main() {

}