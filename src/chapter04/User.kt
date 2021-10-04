package chapter04

class CountingSet<T>(
    private val innerSet: MutableCollection<T> = HashSet()
) : MutableCollection<T> by innerSet {
    var objectsAdded = 0
    override fun add(element: T): Boolean {
        objectsAdded++;
        return innerSet.add(element)
    }

    override fun addAll(c: Collection<T>): Boolean {
        objectsAdded += c.size
        return innerSet.addAll(c)
    }
}


class Users private constructor(val nickname: String) {
    companion object {
        fun newSubscribingUser(email: String) = Users(email.substringBefore('@'))
        fun newFacebookUser(account: Int) = Users("test $account")
    }
}

fun main(args: Array<String>) {
    val cset = CountingSet<Int>()
    val subscribingUser = Users.newSubscribingUser("bob@gmail.com")
    val facebookUser = Users.newFacebookUser(1)
    cset.addAll(listOf(1, 1, 2))
    println("${cset.objectsAdded} objects were added, ${cset.size} remain")
}