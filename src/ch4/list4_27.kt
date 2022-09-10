package ch4

class Person_2(val name : String) {
    companion object Loader {
        fun fromJSON(jsonText : String) : Person_2 = Person_2(jsonText)
    }
}

fun main() {
    val person = Person_2.Loader.fromJSON("SangyunLEE")
    println(person.name)
}