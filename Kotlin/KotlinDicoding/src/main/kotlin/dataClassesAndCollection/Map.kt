package dataClassesAndCollection

fun main(){
    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New Delhi" to "India"
    )

    println(capital["Jakarta"])
    println(capital.getValue("Jakarta"))

    println(capital["Amsterdam"])
    println(capital.getValue("Amsterdam"))

    val mapKeys = capital.keys
    val mapValues = capital.values

    val mutableCapital = capital.toMutableMap()
    mutableCapital.put("Amsterdam", "Netherlands")
    mutableCapital.put("Berlin", "Germany")
}