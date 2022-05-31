package com.kotlin.control

class LeeCodeTest {
}

fun main() {
    println(isPalindrome(10))
}
fun isPalindrome(x: Int): Boolean {
    var temp = 0
    var result = x
    if(result%10 == 0 && result !=0) {
        return false
    }
    while (result>temp){
        temp = (temp * 10) + (result % 10)
        result /= 10
    }
    if(result==temp){
        return true
    }
    if(result==temp/10) {
        return true
    }
    return false
}
open class ATest(val a:Int, val b:String, val c:Int) {

}
class BTest(a:Int,b:String,val c:Int):ATest1(a,b,c) {
    fun aa() {
        println(c)
    }

}