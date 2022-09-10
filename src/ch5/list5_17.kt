package ch5

fun alphabet() : String {
    val stringBuilder = StringBuilder()
    return with(stringBuilder) {
        for (letter in 'A'..'Z')
            this.append(letter)
        append("\nNow I know the alphabet!")
        this.toString()
    }

}