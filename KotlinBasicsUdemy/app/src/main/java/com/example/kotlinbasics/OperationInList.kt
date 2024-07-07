package com.example.kotlinbasics

fun main(){

    val fruitList = mutableListOf("Apple","Mango","Banana","Orange","Pineapple")

    fruitList.add("Guava")
    println(fruitList)
    fruitList.removeAt(2)
    println(fruitList)
    val fruitIsThere = fruitList.contains("Banana")
    if (fruitIsThere){
        println("Found")
    } else {
        println("Not Found.....!!!")
    }

    /* we can also us double dot (..) instead of until which
              includes the last digit (<= 4)
             But in until keyword it excluded
     the last index (< 4) Last index*/


    for (i in 0 until fruitList.size){
        println("Item ${fruitList[i]} is at index $i")
    }
}