package ch6

fun strLenSafe2(s: String?) : Int = s?.length ?: 0

fun main() {
    println(strLenSafe2("abc"))
    println(strLenSafe2(null))
}