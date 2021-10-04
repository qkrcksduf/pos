package chapter04

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun eval(e: Expr): Int =
    when (e) {
        is Num -> e.value
        is Sum -> eval(e.right) + eval(e.left)
        else -> throw IllegalArgumentException("Unknown expression")
    }

class User(val name: String) {
    var address: String = "unspecified"
        set(value: String) {
            println(
                """addresss was changed for $name: 
            "$field" -> "$value".""".trimMargin())
            field = value
        }
}

data class Client(val name: String, val postalCode: Int)

fun main(args: Array<String>) {
    val user = User("Alice")
    user.address = "Elsenheimerstrassse 47, 80687 Muenchen"
    println(user.address)
    val client1 = Client("test", 1)
    val client2 = Client("test", 1)
    println(client1 == client2)
}