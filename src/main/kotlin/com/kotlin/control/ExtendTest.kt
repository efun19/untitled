package com.kotlin.control

class ExtendTest {

}

fun main() {
    val ptest = P2(2)
}
open class P1(var a:Int){
    val b = "asd"
}
class P2: P1{
    constructor(a: Int):super(a)
    init {
        println(a)
        println(b)
    }
}