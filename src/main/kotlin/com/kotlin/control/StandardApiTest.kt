package com.kotlin.control

class StandardApiTest {
}

fun main() {
    //with
    val result = with(Atest()) {
        eat()
        1
    }
    println(result)
    //run
    val result2 = Atest().run{
        eat()
        "asd"
    }
    println(result2)
    //apply
    val result3 = Atest().apply{
        eat()
        "333"
    }
    println(result3)

    Atest().let {  }
}
class Atest{
    fun eat() {
        println("asd")
    }
}