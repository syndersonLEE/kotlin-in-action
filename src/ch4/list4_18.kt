package ch4

class Client(val name: String, val postalCode : Int) {
    override fun toString() : String = "Client(name=$name, postalCode=$postalCode)"
    override fun equals(other: Any?): Boolean {
        if(other == null || other !is Client)
            return false
        return name == other.name && postalCode == other.postalCode
    }

    override fun hashCode(): Int {
        return name.hashCode() * 31 + postalCode
    }
}

fun main() {
    val client1 = Client("이상윤", 6097)
    print(client1)
}