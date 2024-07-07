package com.example.kotlinbasics

fun main(){
    // Immutable List
    //val shoppingList = listOf("Processor","RAM","Graphics Card","SSD")
    // Mutable List

    val shoppingList = mutableListOf("Processor","RAM","Graphics Card","SSD")

    shoppingList.add("Cooling System")
    shoppingList.remove("Graphics Card")
    shoppingList.add(2,"RTX 3090 SUPER")

    println(shoppingList)
}