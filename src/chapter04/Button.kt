package chapter04

class Button: Clickable, Focusable, View() {
    override fun click() {
        println("I'm was clicked")
        clickView()
    }

    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()

    }

}

fun main(args: Array<String>) {
    val button = Button()
    println(button.click())
    println(button.showOff())
    println(button.setFocus(true))
}