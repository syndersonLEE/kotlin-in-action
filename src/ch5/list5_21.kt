package ch5

import javax.naming.Context

fun alphabet_4() = buildString{
    for(letter in 'A'..'Z') {
        append(letter)
    }
    append("\nNow I know the alphabet!")
}

fun main() {
    println(alphabet_4())
}