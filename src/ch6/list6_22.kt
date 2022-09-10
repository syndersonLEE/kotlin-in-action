package ch6

import java.io.BufferedReader
import java.io.StringReader

fun addValidNumbers(numbers: List<Int?>) {
    var sumOfValidNumbers = 0
    var invalidNumbers = 0

    for(number in numbers) {
        if(number != null) {
            sumOfValidNumbers += number
        } else {
            invalidNumbers++
        }
    }
    //val validNumbers = numbers.filterNotNull() 

    println("Sum of valid numbers : $sumOfValidNumbers")
    println("Invalid numbers : $invalidNumbers")
}

fun main() {
    val reader = BufferedReader(StringReader("1\nabc\n42"))
    val numbers = readNumbers(reader)
    addValidNumbers(numbers)
}