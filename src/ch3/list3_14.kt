package ch3

import java.lang.IllegalArgumentException

class User(val id : Int, val name : String, val address : String)

fun User.validateBeforSave() {
    fun validate(value : String, fieldName : String) {
        if(value.isEmpty()) {
            throw IllegalArgumentException( "Can't save user $id empty $fieldName")
        }
    }


    validate(name, "Name")
    validate(address, "Address")

}

fun saveUser(user: User) {
    user.validateBeforSave()
}
fun main() {
    saveUser(User(1, "", ""))
}