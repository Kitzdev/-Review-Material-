package controlFlow

fun main(){
    val listOfInt = listOf(1, 2, 3, null, 5, null, 7)

    //NullPointerException will be meet if we process the null data
    for(i in listOfInt ){
        print("$i ")
    }

    for(i in listOfInt){
        if(i == null) continue
        print("$i ")
    }

    for(i in listOfInt){
        if(i == null) break
        print("$i ")
    }

    loop@ for(i in 1..10){
        println("Outside Loop")

        for(j in 1..10){
            println("Inside Loop")
            if(j > 5) break@loop
        }
    }
}