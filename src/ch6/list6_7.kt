package ch6

fun ignoreNulls(s: String) {
    val sNotNull: String = s!!
    println(sNotNull.length)
}

fun main() {
    ignoreNulls(" ")
}