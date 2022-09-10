package ch5

fun main() {
    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    println(people.maxBy { it.age })
}