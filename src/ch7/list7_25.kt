package ch7

class Person7 {
    private val _attributes = hashMapOf<String, String>()
    fun setAttribute(attrName: String, value: String) {
        _attributes[attrName] = value
    }

    val name: String
    get() = _attributes["name"]!!
}

fun main() {
    val p = Person7()
    val data = mapOf("name" to "Sangyun", "company" to "finda")
    for ((attrName, value) in data)
        p.setAttribute(attrName, value)
    println(p.name)
}