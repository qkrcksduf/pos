//package chapter07
//
//class Point(val x: Int, val y: Int) {
//    override fun equals(other: Any?): Boolean {
//        if (other == this) return true
//        if (other !is Point) return false
//        return other.x == x && other.y == y
//    }
//
//    override fun hashCode(): Int {
//        var result = x
//        result = 31 * result + y
//        return result
//    }
//    //    operator fun plus(other: Point): Point {
//    //        return Point(x + other.x, y + other.y)
//    //    }
//}
//
//operator fun Point.plus(other: Point): Point {
//    return Point(x + other.x, y + other.y)
//}
//
//operator fun Point.times(scale: Double): Point {
//    return Point((x * scale).toInt(), (y * scale).toInt())
//}
//
//operator fun Char.times(count: Int): String {
//    return toString().repeat(count)
//}
//
////operator fun BigDecimal.inc() = this + BigDecimal.ONE
//
//fun main() {
//    //    var p1 = Point(10, 20)
//    //    val p2 = Point(30, 40)
//    //    val p = Point(10, 20)
//    //
//    //    val list = arrayListOf(1, 2)
//    //    list += 3
//    //    val newList = list + listOf(4, 5)
//    //
//    //    var bd = BigDecimal.ZERO
//    //    println(bd++)
//    //    println(++bd)
//    //    println(list)
//    //    println(newList)
//    //
//    //    println(p * 2.0)
//    //    println(p1 + p2)
//    //    println('a' * 3)
//    println(Point(10, 20) == Point(10, 20))
//    println(Point(10, 20) != Point(5, 5))
////    println(null == Point(1, 2))
//}