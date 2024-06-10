package org.example

fun main() {
    val user = User("Ahmed", 23)
    println(user)
}

data class User(var name: String, var age: Int)