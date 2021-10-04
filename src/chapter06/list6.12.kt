package chapter06

fun verifyUserInput(input: String?) {
    if (input.isNullOrBlank()) {
        println("please fill in the required fields")
    } else println(input)
}

fun main() {
    verifyUserInput("")
    verifyUserInput(null)
    verifyUserInput("test")
}