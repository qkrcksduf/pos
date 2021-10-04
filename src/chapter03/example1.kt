@file:JvmName("StringFunctions")

package chapter03

val set = hashSetOf(1, 7, 53)
val list = arrayListOf(1, 7, 53)
val map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")

fun main(args: Array<String>) {
    println(set.javaClass)
    println(list.javaClass)
    println(map.javaClass)
    println(set.first())

    val list = listOf(1, 2, 3)
    println(list.joinToString(separator = "; ", prefix = "(", postfix = ")"))
    println(list.joinToString())
    val example = "test1, test2, test3"
    val test = listOf("test: ", example)
    println(test)
}

fun listOf(elements: String, elements1: String): List<String> {
    TODO("Not yet implemented")
}

fun String.lastChar(): Char = get(length - 1)