package kotlinFundamental

fun main()
{
    val openHours = 7
    val now = 20

    if(now > openHours) {
        println("Office is already open")

    } else if (now == openHours) {
        println("Wait a minute, office will be open")

    } else {
        println("Office is closed")
    }

    val office: String = if(now >= openHours) {
        "Office is already open"

    } else {
        "Office is closed"
    }

    println(office)

    //Kotlin is not support ternary operator
}