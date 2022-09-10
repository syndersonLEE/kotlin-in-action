package ch5

fun printProblemCounts(response: Collection<String>) {
    var clientErrors = 0
    var serverErrors = 0
    response.forEach {
        if(it.startsWith("4")) {
            clientErrors++
        } else if(it.startsWith("5")) {
            serverErrors++
        }
    }
    println("$clientErrors client errors, $serverErrors server errors")
}

fun main() {
    val responses = listOf("200 OK", "418 I'm a teapot", "500 Internal Server Error")
    printProblemCounts(responses)

    val people = listOf(Person("Alice", 29), Person("Bob",31))
    println(people.filter{ it.age > 30 })

    val list = listOf(1,2,3,4)
    println(list.map{ it * it })

    println(people.map{ it.nickname })

    println(people.filter { it.age > 30 }.map(Person::nickname))

    println(people.filter { it.age == people.maxByOrNull(Person::age)!!.age })

    val canBeInClub27 = { p: Person -> p.age <= 27 }

    val people_2 = listOf(Person("Alice", 27), Person("Bob", 29))
    println(people_2.count(canBeInClub27))

    val people_3 = listOf(Person("Alice", 27), Person("Bob", 31))
    println(people_3.all(canBeInClub27))

    val people_4 = listOf(Person("Alice", 31), Person("Bob", 29), Person("Carol", 31))
    println(people_4.groupBy{ it.age })

    val list_2 = listOf("a", "ab", "b")
    println(list_2.groupBy(String::first))

    val strings = listOf("abc", "def")
    println(strings.flatMap{ it.toList() })

    println(people_4.asSequence()
        .map(Person::nickname)
        .filter { it.startsWith("A") }
        .toList())
}