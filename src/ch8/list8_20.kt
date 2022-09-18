package ch8

fun lookForSangyunUsingLabel(people: List<Person2>) {
    people.forEach label2@{
        if(it.name == "Sangyun") return@label2
    }
    println("Sangyun might be somewhere")
}

fun main() {
    lookForSangyunUsingLabel(people)
}