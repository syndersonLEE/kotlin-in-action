package ch5

import java.lang.StringBuilder

fun alphabet_3() = StringBuilder().apply {
    for(letter in 'A'..'Z')
        append(letter)
    append("\nNow I know the alphabet")
}.toString()