package chapter03

class User(val id: Int, val name: String, val address: String?)

fun saveUser(user: User) {
    fun validate(user: User,
                 value: String,
                 fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("Cant't save user ${user.id}: empty $fieldName")
        }
    }

    validate(user, user.name, "Name")
    user.address?.let { validate(user, it, "Address") }
}

fun main(args: Array<String>) {
    saveUser(User(1, "chanyeol", null))
}