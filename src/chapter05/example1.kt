//package chapter05
//
//import Person1
//
//fun main() {
//    val canBeInClub27 = { p: Person1 -> p.age!! <= 27 }
//
//    val people = listOf(Person1("Alice", 27), Person1("Bob", 31))
//    println(people.groupBy { it.age })
//
//    val strings = listOf("abc", "def")
//    println(strings.flatMap { it.toList() })
//
//    people.asSequence()
//        .map(Person1::name)
//        .filter { it.startsWith("A") }
//        .toList()
//
//    listOf(1, 2, 3, 4).asSequence()
//        .map { print("map($it) "); it * it }
//        .filter { print("filter($it) "); it % 2 == 0 }
//        .toList()
//
//
//}