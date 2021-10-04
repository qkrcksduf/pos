//package chapter05
//
//import Person1
//
//fun findTheOldest(people: List<Person1>) {
//
//    var maxAge = 0
//    var theOldest: Person1? = null
//
//    for (person in people) {
//        if (person.age!! > maxAge) {
//            maxAge = person.age
//            theOldest = person
//        }
//
//    }
//    println(theOldest)
//}
//
//fun main(args: Array<String>) {
//    val people = listOf(Person1("test1", 10), Person1("test2", 20), Person1("test3", 30))
//    findTheOldest(people)
//    println(people.maxByOrNull { it.age!! })
//    println(people.maxByOrNull { p -> p.age!! })
//    run { println(42) }
//    val names1 = people.joinToString(separator = " ", transform = { p -> p.name })
//    val names2 = people.joinToString() { p -> p.name }
//    val names3 = people.joinToString { it.name }
//    val names4 = people.joinToString()
//    println(names1)
//    println(names2)
//    println(names3)
//    println(names4)
//
//}