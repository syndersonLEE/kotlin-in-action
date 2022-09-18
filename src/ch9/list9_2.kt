package ch9


val authors = listOf("Sangyun", "LEE")
val readers = mutableListOf<String>("test1", "test2")

val <T> List<T>.penultimate:T
    get() = this[size -2]

fun main() {
    readers.filter{it !in authors}
    println(listOf(1,2,3,4).penultimate)

}