package chapter03

//import test.lastChar as last

fun <T> Collection<T>.joinToString(
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""): String {
    val result = StringBuilder(prefix)

    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}


fun parsePath(path: String) {
    val directory = path.substringBeforeLast("/")
    val fullName = path.substringAfterLast("/")
    val fileName = fullName.substringBeforeLast(".")
    val extension = fullName.substringAfterLast(".")
    println("Dir: $directory, fullName: $fullName, name: $fileName, ext: $extension")
}

fun parsePaths(path: String) {
    val regex = """(.+)/(.+)\.(.+)""".toRegex()
    val matchResult = regex.matchEntire(path)
    if (matchResult != null) {
        val (directory, filename, extension) = matchResult.destructured
        println("Dir: $directory, name: $filename, ext: $extension")
    }
}

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3)
    println(list.joinToString(separator = "; ", prefix = "(", postfix = ")"))
    println(list.joinToString())
    println("kotlin".last())
    println("kotlin".lastChar())
    println("12.3456-6.A".split(".", "-"))
    println("12.3456-6.A".split("\\.|-".toRegex()))
    parsePath("/Users/chanyeol/workspace/development/study/kotlin/kotlin-in-action/test.kt")
    parsePaths("/Users/chanyeol/workspace/development/study/kotlin/kotlin-in-action/test.kt")
}