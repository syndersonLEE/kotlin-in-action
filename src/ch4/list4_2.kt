package ch4

class Button : Clickable {
    override fun click () = println("I was clicked")
}

fun main() {
    Button().click()
}