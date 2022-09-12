package ch7

operator fun Point.unaryMinus() : Point {
    return Point(-x, -y)
}

fun main() {
    val p = Point(10, 20)
    print(-p)
}