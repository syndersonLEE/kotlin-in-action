package ch8

data class Person2(val name : String, val age : Int)

val people = listOf(Person2("Sangyun", 30), Person2("Somin", 25))

fun lookForAlice(people: List<Person2>) {
//    for (person2 in people) {
//        if(person2.name == "Sangyun") {
//            println("Found!")
//            return
//        }
//    }

    people.forEach{
        if(it.name == "Sangyun") {
            println("Found!")
            return
        }
    }
    println("Sangyun not found")
}

fun main() {
    lookForAlice(people)
}
