package kotlinFunctionalProgramming

fun main(){
    //run function
    val text = "Hello"
    val result = text.run{
        val from = this
        val to = this.replace("Hello", "Kotlin")
        "replace text from $from to $to"
    }

    println("Result: $result")

    //with function
    val message = "Hello Kotlin"
    val result2 = with(message){
        println("Valus is $this")
        println("With length ${this.length}")

        "First character is ${this[0]} and last character is ${this[this
            .length - 1]}"
    }

    //apply function
    val builder = StringBuilder()
    builder.append("Hello ")
    builder.append("Kotlin!")

    val builder2 = StringBuilder().apply{
        append("Hello ")
        append("Kotlin!")
    }

    println(builder.toString())
    println(builder2.toString())
}