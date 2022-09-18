package ch8

fun lookForSangyunUsingNonNamingFunciton (people : List<Person2>) {
    people.forEach(fun (person) {
        if(person.name == "Sangyun") return
        println("${person.name} is not Sangyun")
    })
}

fun main() {
    lookForSangyunUsingNonNamingFunciton(people)
}