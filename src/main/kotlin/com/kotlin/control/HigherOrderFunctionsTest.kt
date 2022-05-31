package com.kotlin.control

class HigherOrderFunctionsTest {
}

fun main() {
    val result1 = build{}
    println(result1)
    a2 { a1 { } }
}
fun StringBuilder.build(block: ()->Unit):StringBuilder {
    block()
    return StringBuilder()
}
fun StringBuilder.build2(block: StringBuilder.()->Unit):StringBuilder {
    block()
    return this
}
fun build(block: ()->Unit):Int {
    return 1
    block()
}
inline fun a1(block: () -> Unit) {
    block()
}
 fun a2( block: () -> Unit) {
    block
}