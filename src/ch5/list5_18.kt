package ch5

import java.lang.StringBuilder

fun alphabet_2() = with(StringBuilder()) {
    for (letter in 'A'..'Z') {
        append(letter)
    }

    append("\nNow I know the alphabet!")
    toString()
}

