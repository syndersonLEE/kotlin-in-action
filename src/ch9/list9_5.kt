package ch9

import java.lang.IllegalArgumentException

fun printSum(c: Collection<*>) {
    val intList = c as? List<Int>
        ?: throw IllegalArgumentException("List is expected")
    println(intList.sum())
}

fun main() {
    printSum(listOf(1,2,3))
//    printSum(setOf(1,2,3))
//    printSum(listOf("1","2","3"))
}