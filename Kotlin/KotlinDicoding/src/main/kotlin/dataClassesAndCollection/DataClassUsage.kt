package dataClassesAndCollection

class User(val name: String, val age: Int)

data class DataUser(val name: String, val age: Int){
    fun intro(){
        println("My name is $name, I am $age years old")
    }
}

fun main(){
    val user = User("Nrohmen", 17)
    val dataUser = DataUser("Nrohmen", 17)
    val dataUser2 = DataUser("Nrohmen", 17)
    val dataUser3 = DataUser("Dimas", 16)
    val dataUser4 = dataUser.copy()
    val dataUser5 = dataUser.copy(age = 18)

    println(user)
    println(dataUser)
    println(dataUser.equals(dataUser2))
    println(dataUser.equals(dataUser3))
    println(dataUser.equals(dataUser4))
    println(dataUser.equals(dataUser5))

    dataUser.intro()

    val name = dataUser.component1()
    val age = dataUser.component2()

    println("My name is $name, I am $age years old")

    val (name2, age2) = dataUser

    println("My name is $name, I am $age years old")

}