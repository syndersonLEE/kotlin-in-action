package ch4

class User_3 {
    val nickname : String
    constructor(email : String) {
        nickname = email.substringBefore('@')
    }

}