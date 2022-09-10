package ch5

fun printMessageWithPrefix(messages : Collection<String>, prefix : String) {
    messages.forEach {
        println("$prefix $it")
    }
}

fun main() {
    val errors = listOf("403 Forbidden", "404 Not Found")
    printMessageWithPrefix(errors, "Error:")
}