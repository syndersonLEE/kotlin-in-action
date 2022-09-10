package ch5

fun main() {
    val people = listOf(Person("이몽룡", 29), Person("성춘향", 31))
    val names = people.joinToString(separator = " ", transform = { p : Person -> p.nickname })
    println(names)
}