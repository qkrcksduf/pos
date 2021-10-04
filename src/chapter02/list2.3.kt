package chapter02

import java.util.*


class Person(var name: String) {
    override fun toString() = "name: $name"
    fun test() = name.isNotBlank()
}

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() = height == width

    override fun toString() = "width: $width, height: $height"

}

fun createRandomRectangle(): Rectangle {
    val random = Random()
    return Rectangle(random.nextInt(), random.nextInt())
}

fun main() {
    val person = Person("test")
    println(person.toString())
    person.name = "okok"
    println(person.toString())
    val rectangle = Rectangle(10, 20)
    println(rectangle.isSquare)
    println(createRandomRectangle().toString())
}