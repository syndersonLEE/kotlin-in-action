package ch6

class Person3(val firstName: String, val lastName: String) {
    override fun equals(o: Any?): Boolean {
        val otherPerson = o as? Person3 ?: return false
        return otherPerson.firstName == firstName &&
                otherPerson.lastName == lastName
    }

    override fun hashCode(): Int =
            firstName.hashCode() * 37 + lastName.hashCode()
}

fun main() {
    val p1 = Person3("Sangyun", "LEE")
    val p2 = Person3("Sangyun", "LEE")

    println(p1 == p2)
    println(p1.equals(42))
}