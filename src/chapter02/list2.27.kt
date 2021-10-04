package chapter02

import java.io.BufferedReader
import java.io.StringReader

fun readNumber(reader: BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine())
//        val line = (reader.readLine())

    } catch (e: NumberFormatException) {
        null
    }
    println(number)
}

fun main() {
    val reader = BufferedReader(StringReader("123"))
    readNumber(reader)
}