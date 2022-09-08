package ch4


class Button_2 : Clickable_2, Focusable {
    override fun click() = println("I was clicked")
    override fun showOff() {
        super<Clickable_2>.showOff()
        super<Focusable>.showOff()
    }
 }

fun main(args : Array<String>) {
    val button = Button_2()
    button.showOff()
    button.setFocus(true)
    button.click()
}