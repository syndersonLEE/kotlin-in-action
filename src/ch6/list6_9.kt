package ch6

fun sendEmailTo(email : String) {
    println("Sending email to $email")
}

fun main() {
    var email: String? = "winnery93@gmail.com"
    email?.let { sendEmailTo(it) }
    email = null
    email?.let { sendEmailTo(it)}
}