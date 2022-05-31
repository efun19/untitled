package com.kotlin.control

class CollocationTest {
}

fun main() {
    val m1 = mapOf("asd" to 1, "qwe" to 2, "asd" to 3)
    for ((key,value ) in m1) {
        println("$key and $value")
    }

    val list = listOf(22,33,334,1234,434413)
    val newList = list.filter { it<4000 }.map { it+300 }.any{it>4000}
    println(newList)
}