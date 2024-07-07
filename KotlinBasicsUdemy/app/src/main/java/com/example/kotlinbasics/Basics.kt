package com.example.kotlinbasics

fun main(){

    var scooby = Dog("Scooby","Labradore",4)
    println("${scooby.name} is a dog of ${scooby.breed} breed And ${scooby.age} years old")
    println("A year has passed!")
    scooby.age = 2
    println("${scooby.name} is a dog of ${scooby.breed} breed And ${scooby.age} years old")

//    val myBook = Book("Unknown","Anonymous",2024)
//    println("The Title Of the Book is : ${myBook.title} -- The Name Of The Author is : ${myBook.author} -- The Year Of Published : ${myBook.yearPublished}")
//
//    println("Modified version")
//    val myBook1 = Book("Merchant Of Venice","William Shakespeare",1800)
//    println("The Title Of the Book is : ${myBook1.title} -- The Name Of The Author is : ${myBook1.author} -- The Year Of Published : ${myBook1.yearPublished}")


    //val is non mutable
//    var number1 = 10
//    number1 = 20
//    println(number1)
//    val myAge: Byte = 20
//    println(myAge)
//    println("Hello World!!!")
//    val decimalnum = 12.0912
//    println(decimalnum)
//    val floatnum = 12.09099f
//    println(floatnum)

//    val age: UShort = 20u
//    println(age)

//    val age = 20
//    if (age >= 18){
//        println("Eligible For Vote")
//    } else {
//        println("Not Eligible")
//    }

//    val myTrue: Boolean = true
//    val myFalse: Boolean = false
////    val boolNull: Boolean? = null
//
//    println(myTrue || myFalse)// OR --> true
//    println(myTrue && myFalse)// AND --> false
//    println(!myTrue)// NOT --> false

//    val myChar = '\u00AE'
//    println(myChar)
}