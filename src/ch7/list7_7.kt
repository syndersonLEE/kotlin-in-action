package ch7

class Point2(val x : Int, val y : Int) {
    override fun equals(obj: Any?): Boolean {
        if(obj === this) return true
        if(obj !is Point) return false
        return obj.x == x && obj.y == y
    }
}

fun main() {
    println(Point(10, 20) == Point(10, 20))
    println(Point(10,20) != Point(5, 5))
    println(null == Point(1, 2))
}