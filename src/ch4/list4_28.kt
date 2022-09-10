package ch4

interface JSONFactory<T> {
    fun fromJSON(jsonText : String) : T
}

class Person_3 (val name : String) {
    companion object : JSONFactory<Person_3> {
        override fun fromJSON(jsonText: String): Person_3 = Person_3(jsonText)
    }
}