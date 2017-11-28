package main.kotlin

data class User(val id: Int, val username: String, val email: String)

fun loadUsers(): List<User> {
    val kotlinJvmDev = User(1, "kotlin-jvm-dev", "dev-jvm@kotlin.com")
    val kotlinJsDev = User(2, "kotlin-js-dev", "dev-js@kotlin.com")
    val javaDev = User(3, "java-dev", "dev@java.com")
    return arrayListOf(kotlinJvmDev, kotlinJsDev, javaDev)
}