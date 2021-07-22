package controlFlow

fun main(){
    var loop = 7

    //Entry controled loop
    while(loop != 0){
        println("Hello Kotlin!")
        loop--
    }

    //Exit controled loop
    while(loop <= 7){
        println("Hello Kotlin!!")
        loop++
    }
}