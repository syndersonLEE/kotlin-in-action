package ch2

import java.util.Random

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() = height == width
}

fun createRandomReactangle() : Rectangle {
    val random = Random()
    return Rectangle(random.nextInt(), random.nextInt())
}
