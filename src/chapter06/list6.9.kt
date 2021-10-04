package chapter06

fun senEmailTo(email: String) =
    println("Sending email to $email")

fun main() {
    var email: String? = "yole@example.com"
    email?.let { test: String -> senEmailTo(test) }
    email = null
    email?.let { senEmailTo(it) }
}