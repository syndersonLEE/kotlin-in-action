package ch6

data class Person5(val name: String, val age: Int? = null) {
    fun isOlderThan(other: Person5) : Boolean? {
        if(age == null || other.age == null)
            return null
        return age > other.age
    }
}

fun main() {
    println(Person5("Sangyun", 29).isOlderThan(Person5("Junsae", 31)))
    println(Person5("Sangyun", 29 ).isOlderThan(Person5("Hiyun", 26)))
}