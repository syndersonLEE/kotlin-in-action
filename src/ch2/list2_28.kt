package ch2

import java.io.BufferedReader
import java.io.StringReader
import java.lang.NumberFormatException
import java.nio.Buffer

fun readerNumber(reader: BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine())
    } catch (e : NumberFormatException) {
        return
    }
    println(number)
}

fun main() {
    val reader = BufferedReader(StringReader("not a number"))
    readerNumber(reader)
}