package ch6

import java.util.*

fun yellAtSafe(person : list6_15.Person4) {
    println((person.name ?: "Anyone").uppercase(Locale.getDefault()) + "!!!")
}

fun main() {
    yellAtSafe(list6_15().Person4(null))
}