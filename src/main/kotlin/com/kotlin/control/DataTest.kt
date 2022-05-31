package com.kotlin.control

class DataTest {
}

fun main() {
    val a = B(1,"222")
    val b = B(1,"222")
    println(a==b)
}
data class A(val a:Int,val b:String)

class B(val a:Int,val b:String){
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as B

        if (a != other.a) return false
        if (b != other.b) return false

        return true
    }

    override fun hashCode(): Int {
        var result = a
        result = 31 * result + b.hashCode()
        return result
    }
}