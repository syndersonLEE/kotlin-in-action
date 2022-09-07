package ch3

fun View.showOff() = println("I'm a view!")
fun Button.showOff() = println("I'm a button!")


fun main() {
    val view : View = Button()
    view.showOff()
}