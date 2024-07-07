package com.example.kotlinbasics

fun main(){
    println("Enter your age: ")
    val age = readln().toInt()
    // range check
    if (age in 18..40){
        println("Allowed To Enter In PUB")
    } else if (age >=40){
        println("Too OLD to Enter")
    }
    else {
        println("Not Allowed In PUB")
    }
}