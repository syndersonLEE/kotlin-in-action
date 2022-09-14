package ch8

data class Person (
    val firstName: String,
    val lastName: String,
    val phoneNumber: String?)

class ContactListFilters {
    var prefix : String = ""
    var onlyWithPhoneNumer : Boolean = false

    fun getPredicate(): (Person) -> Boolean {
        val startsWithPrefix = { p: Person ->
            p.firstName.startsWith(prefix) || p.lastName.startsWith(prefix)
        }

        if(!onlyWithPhoneNumer) {
            return startsWithPrefix
        }

        return { startsWithPrefix(it) && it.phoneNumber != null }
    }
}

fun main() {
    val contacts = listOf(Person("Sangyun", "LEE","6097"), Person("Sohee", "LEE", null))
    val contactListFilters = ContactListFilters()
    with (contactListFilters) {
        prefix = "Sa"
        onlyWithPhoneNumer = true
    }
    println(contacts.filter(
        contactListFilters.getPredicate()
    ))
}