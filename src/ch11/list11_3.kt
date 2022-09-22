package ch11

val appendExcl : StringBuilder.() -> Unit = {
    this.append("!")
}

fun main() {
    val stringBuilder = StringBuilder("Hi")
    stringBuilder.appendExcl()
    println(stringBuilder)
    println(buildString(appendExcl))
}