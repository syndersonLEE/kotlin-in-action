package ch9

fun <T : R, R> copyData(source : MutableList<out T>, destination : MutableList<in T>) {
    for(item in source) {
        destination.add(item)
    }
}

fun main() {
    val ints = mutableListOf(1, 2, 3)
    val anyItems = mutableListOf<Any>()
    copyData(ints, anyItems)
    println(anyItems)
}