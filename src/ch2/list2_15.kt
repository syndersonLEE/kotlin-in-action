package ch2

import java.lang.Exception

fun mix(c1 : Color, c2 : Color) =
    when (setOf(c1, c2)) {
        setOf(Color.RED, Color.YELLOW) -> Color.ORANGE
        setOf(Color.YELLOW, Color.BLUE) -> Color.GREEN
        setOf(Color.BLUE, Color.VIOLET) -> Color.INDIGO
        else -> throw Exception("Dirty Color")
    }

fun main() {
    println(mix(Color.BLUE, Color.YELLOW))
}
