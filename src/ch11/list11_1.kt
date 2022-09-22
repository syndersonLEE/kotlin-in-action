package ch11

fun buildString(
    builderAction: (StringBuilder) -> Unit
) : String {
    val sb = StringBuilder()
    builderAction(sb)
    return sb.toString()
}

fun main() {
    val s = buildString{
        it.append("Hello, ")
        it.append("World!")
    }
    println(s)
}