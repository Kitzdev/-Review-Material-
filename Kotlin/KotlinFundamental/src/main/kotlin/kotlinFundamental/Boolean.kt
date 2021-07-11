package kotlinFundamental

fun main()
{
    val color = "orange"
    val shape = "round"

    val fruit = if(color == "orange" && shape == "round"){
        "It is an orange"

    } else {
        "It is not an orange"
    }

    println(fruit)

    val hairColor = "black"
    val height = 170

    val name = if(hairColor == "black" || height == 170){
        "Budi"

    } else {
        "Badi"
    }

    println(name)

    val handsome = false
    println(!handsome)
}