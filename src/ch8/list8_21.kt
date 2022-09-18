package ch8

fun lookForSangyunUsingFunctionLabel(people: List<Person2>) {
    people.forEach {
        if(it.name == "Sangyun") return@forEach
    }
    println("Sangyun might be somewhere")
}