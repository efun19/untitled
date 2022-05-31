package com.kotlin.control

fun main() {
    for (i in 0..3) {
        for (x in 1 until 3){
            for (y in 10*x downTo 1*x) {
                println(y)
            }
        }
    }
}