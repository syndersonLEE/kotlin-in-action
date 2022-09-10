package ch4

class User_4 private constructor(val nickname : String) {
    companion object {
        fun newSubscribingUser(email: String) =
            User_4(email.substringBefore('@'))
    }
}


fun main() {
    val subscribingUser = User_4.newSubscribingUser("bob@gmail.com")
    println(subscribingUser.nickname)
}