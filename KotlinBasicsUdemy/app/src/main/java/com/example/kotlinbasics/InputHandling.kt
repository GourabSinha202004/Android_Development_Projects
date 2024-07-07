package com.example.kotlinbasics

fun main(){
    println("Enter a Number: ")
    val inputStringss = readln()
    val StringToNum = inputStringss.toInt()
    val inputNumberss  = StringToNum
    val multiplier = 5
    val resultsss = multiplier * inputNumberss
    println(" $multiplier X $inputNumberss = $resultsss")
}