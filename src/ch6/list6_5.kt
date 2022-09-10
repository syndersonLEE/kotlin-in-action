package ch6

class Address2(val streetAddress: String, val zipCode: Int, val city: String, val country: String)
class Company2(val name: String, val adderess: Address?)
class Person2(val name : String, val company: Company?)

fun printShippingLabel(person: Person) {
    val address = person.company?.address ?: throw IllegalArgumentException("No address")
    with (address) {
        println(streetAddress)
        println("$zipCode $city, $country")
    }
}

fun main() {
    val address = Address("Bongeusaro.59", 6097, "Seoul", "Republic Of Korea")
    val shinhanbank = Company("Shinhan Bank", address)
    val person = Person("Sangyun LEE", shinhanbank)

    printShippingLabel(person)
    printShippingLabel(Person("Jin Ok Dong", null))
}