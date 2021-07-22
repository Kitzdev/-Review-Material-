package controlFlow

fun main()
{
    //If in Kotlin can be act as an expression
    val openOffice = 7
    val now = 8
    val officeStatus: String = if(openOffice < now) "Office is open!" else {
        "Office is closed!"
    }
}