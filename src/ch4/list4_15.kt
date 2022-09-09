package ch4

class User_2(val name: String) {
    var address : String = "unspecified"
        set(value : String) {
            println("""
                Address was changed for $name:
                "$field" -> "$value"
            """.trimIndent())
        }
}

fun main() {
    val user = User_2("Alice")
    user.address = "Boneunsaro59, 19 Daemione Village"
}