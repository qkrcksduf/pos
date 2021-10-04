package chapter06

fun fail(message: String) : Nothing {
    throw IllegalStateException(message)
}

fun main() {
    fail("Error occurred")
}