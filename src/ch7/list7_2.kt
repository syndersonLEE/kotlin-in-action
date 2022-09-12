package ch7

operator fun Point.plus (other: Point): Point {
    return Point(x + other.x, y + other.y)
}