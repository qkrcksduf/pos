//package chapter05
//
//import Person1
//import java.util.*
//
//
//fun printProblemCounts(responses: Collection<String>) {
//    var clientErrors = 0
//    var serverErrors = 0
//    responses.forEach {
//        if (it.startsWith("4")) {
//            clientErrors++
//        } else if (it.startsWith("5")) {
//            serverErrors++
//        }
//    }
//    println("$clientErrors client errors, $serverErrors server errors")
//}
//
//fun salute() = println("Salute!")
//
//fun main(args: Array<String>) {
//    val responses = listOf("200 OK", "418 I'm a teapot", "500 Internal Server Error")
//    printProblemCounts(responses)
//    run(::salute)
//
//    val createPerson = ::Person1
//    val p = createPerson("Alice", 20)
//    println(p)
//    val predicate = Person1::isAdult
//    println(predicate)
//
//    val list = listOf(1, 2, 3, 4)
//    println(list.filter { it % 2 == 0 })
//    println(list.map { it * it })
//    println(list.filter { it > 3 }.map { it * it })
//
//    val numbers = mapOf(0 to "zero", 1 to "one")
//    println(numbers.mapValues { it.value.uppercase(Locale.getDefault()) })
//}
//
//fun Person1.isAdult() = age!! >= 21
