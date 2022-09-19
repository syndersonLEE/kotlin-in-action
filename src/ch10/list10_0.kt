package ch10

import kotlin.reflect.full.*

class Person(val name : String, val age : Int)

fun main() {
    val person = Person("Sangyun", 30)
    val kClass = person.javaClass.kotlin

    println(kClass.simpleName)
    kClass.memberProperties.forEach{
        println(it.name)
    }
}