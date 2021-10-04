package chapter06

fun strLenSafe(s: String?): Int? =
    s?.length

fun main() {
    val x: String? = null
    println(strLenSafe("abc"))
}