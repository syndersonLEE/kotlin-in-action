package ch7

class Email() {}

fun loadEmails(person: Person2) : List<Email> {
    println("${person.name}의 이메일 가져옴")
    val emailSample = Email()
    return listOf(emailSample)
}

class Person2(val name: String) {
    private var _emails: List<Email>? = null
    val emails: List<Email>
        get() {
            if(_emails == null) {
                _emails = loadEmails(this)
            }
            return _emails!!
        }

}

fun main() {
    val p = Person2("Sangyun")
    p.emails
}

