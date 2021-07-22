package controlFlow

fun main()
{
    val colorRed = Color.RED
    val colorGreen = Color.GREEN
    val colorBlue = Color.BLUE

    val colors: Array<Color> = Color.values()
    colors.forEach{
        color -> println(color)
    }

    val color = Color.valueOf("RED")
    println("Color is $color")

    val anotherColors: Array<Color> = enumValues()
    anotherColors.forEach{
        color -> println(color)
    }

    val anotherColor: Color = enumValueOf("RED")
    println("Color is $anotherColor")
    println("Position RED is ${anotherColor.ordinal}")

    when(anotherColor){
        Color.RED -> println("Color is RED")
        Color.GREEN -> println("Color is GREEN")
        Color.BLUE -> println("Color is BLUE")
    }

}

enum class Color(val Value: Int)
{
    RED(0xFF0000){
        override fun printValue() {
            println("Color is RED")
        }
    },
    GREEN(0x00FF00){
        override fun printValue() {
            println("Color is GREEN")
        }
    },
    BLUE(0x0000FF){
        override fun printValue() {
            println("Color is BLUE")
        }
    };

    abstract fun printValue()
}

enum class anotherColor()
{
    YELLOW, BLACK, WHITE
}

