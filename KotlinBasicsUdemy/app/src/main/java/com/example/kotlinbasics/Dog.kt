package com.example.kotlinbasics

class Dog (val name: String, val breed: String, var age: Int = 0){

    init {
        Bark(name)
    }
    private fun Bark(name: String){
        println("$name says Woof Woof")
    }
}