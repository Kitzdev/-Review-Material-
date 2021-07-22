package kotlinFunctionalProgramming

//Default Argument
fun getFullName(
        first: String = "Dicoding",
        middle: String = "is",
        last: String = "Awesome"): String{
    return "$first $middle $last"
}

fun main(){
    //Named argument
    val fullName = getFullName("Kotlin", "is", "awesome")
    val fullName2 = getFullName(first = "Kotlin", middle = "is", last =
    "Awesome")
    val fullName3 = getFullName(middle = "is", last = "awesome", first =
    "Kotlin")
    val fullName4 = getFullName()
    val fullName5 = getFullName("Kotlin")
    val fullName6 = getFullName(last = "funtastic")

    println(fullName)
    println(fullName2)
    println(fullName3)
    println(fullName4)
    println(fullName5)
    println(fullName6)
}