package ch4

class Client_2(val name: String, val postalCode : Int) {
    override fun equals(other: Any?) : Boolean {
        if(other == null || other !is Client) {
            return false
        }
        return name == other.name &&
                postalCode == other.postalCode
    }

    override fun toString() = "Client (name=$name, postalCode=$postalCode)"

    override fun hashCode(): Int {
        return name.hashCode() * 31 + postalCode
    }
}