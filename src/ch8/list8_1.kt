package ch8

fun twoAndThree(operation : (Int, Int) -> Int) {
    val result = operation(2,3)
    println("The result $result")
}

fun main() {
    twoAndThree{ a, b -> a + b }
    twoAndThree{ a, b -> a * b }
}