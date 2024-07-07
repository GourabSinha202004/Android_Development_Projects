package com.example.kotlinbasics

fun main(){

    val number = mutableListOf(1,2,3,4,5)

    val n = number.size
    for (i in 0 until n){
        number[i] = number[i]*2
        println("Value is ${number[i]} is at index $i")
    }
}