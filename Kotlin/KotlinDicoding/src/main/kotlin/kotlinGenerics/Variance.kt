package kotlinGenerics

abstract class Vehicle(wheel: Int)
class Car(speed: Int) : Vehicle(4)
class MotorCycle(speed: Int) : Vehicle(2)

/*
    COVARIANT --> keyword: "out"

    When we sign a parameter type with "out", the value of the parameter type
    only can be produced like make it as a return type.

    Also it cannot be consumed like make it as a parameter type for any
    function inside the class.
 */
interface List3<out E> : Collection<E> {
    operator fun get(index: Int): E
    }

/*
    CONTRAVARIANT --> keyword: "in"

     Value from the parameter can be consumed with make it as a argument type
     of every function inside the class and cannot be produced.
 */
interface Comparable<in T> {
    operator fun compareTo(other: T): Int
}

fun main() {
    val car = Car(200)
    val motorCycle = MotorCycle(100)
    var vehicle: Vehicle = car
    vehicle = motorCycle

    val carList = listOf(Car(100), Car(120))
    val vehicleList = carList
}