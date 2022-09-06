package ch2

fun getWarmth (color : Color) = when (color) {
    Color.RED, Color.ORANGE, Color.YELLOW -> "warm"
    Color.GREEN -> "netural"
    Color.BLUE, Color.INDIGO, Color.VIOLET -> "cold"
}

fun main() {
    println(getWarmth(Color.ORANGE))
}