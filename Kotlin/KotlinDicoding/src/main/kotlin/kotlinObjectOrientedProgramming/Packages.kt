package kotlinObjectOrientedProgramming

import kotlin.random.Random
import kotlin.math.PI
import kotlin.math.cos as cosinus
import kotlin.math.sqrt as akar

//Import all class, function, and variable from package kotlin.math
import kotlin.math.*

/*
    When we want to use a class, a function, or a variable from outside of
    the file, we need to import it first

    import packagename.ClassName
    import packagename.functionName
    import packagename.propertyName
 */
fun main(){
    //These code means class Random is in kotlin.random package
    val someInt = kotlin.random.Random(0).nextInt(1, 10)

    println(PI)
    //println(cos(120.0))
    //println(sqrt(9.0))
    println(cosinus(120.0))
    println(akar(9.0))
}