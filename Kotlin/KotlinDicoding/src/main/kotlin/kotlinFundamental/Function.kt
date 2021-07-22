package kotlinFundamental

fun greetUser(name: String): String = "Good morning $name"

fun greetAnotherUser(name: String) = "Good morning $name"

fun greetUserAgain(name: String): Unit{
    print("Hello $name")
}

fun greetAnotherUSerAgain(name: String){
    print("Hello $name")
}

fun main()
{
    /*
        Create a function

        fun functionName(parameter1: type1, parameter2: type2, ...): ReturnType{
            return (value)
        }

        fun functionName(parameter1: type1, parameter2: type2, ...) = (return
         value)

        fun functionName(parameter1: type1, parameter2: type2, ...): "Unit"{
            //This function does not return anything
        }

        fun functionName(parameter1: type1, parameter2: type2, ...){
            print("Hello $parameter1")
        }
     */

    println(greetUser("Kitbert"))
}