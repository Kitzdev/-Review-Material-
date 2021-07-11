package kotlinFundamental

fun main() {
    val text: String? = null
    val length = text?.length

    /*
        This line of code is equivalent to:

        if(text != null) {
            textLength = text.length

        } else {
            textLength = 7
        }

     */
    val textLength = text?.length ?: 7
}