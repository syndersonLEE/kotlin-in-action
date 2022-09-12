package ch7

class Person (val firstName: String, val lastName: String) : Comparable<Person> {
    override fun compareTo(other: Person): Int {
        return compareValuesBy(this, other, Person::lastName, Person::firstName)
    }
}

fun main() {
    val p1 = Person("Sangyun", "LEE")
    val p2 = Person("Sanghun", "Kim")
    println(p1 < p2)
}