package kotlinFundamental

fun main()
{
    val textString: String = "Kotlin"
    println("First Character of $textString is " + textString[0])

    val anotherString: String = " is the best!"
    println(textString + anotherString)

    /*
        Escaped String

        \t: Add a tab to the text
        \n: Add a new line to the text
        \': Add a single quote to the text
        \": Add a double quote to the text
        \\: Add a backslash to the text
     */

    val unicodeTest = "\"Unicode\" text: \u00A9"
    println(unicodeTest)

    /*
        Raw String
        Opened and closed with triple double quote
        """
         Line 1
         Line 2
         Line 3
         Line 4
        """
     */

    val rawStringTest = """
        Line 1
        Line 2
        Line 3
        Without an escaped string and concatenation, we can make a newline 
        after each line.
    """.trimIndent()
    println(rawStringTest)
}
