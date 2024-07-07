package com.example.kotlinbasics


data class coffeeDetails(val sugarCount: Int,
                         val name: String,
                         val size: String,
                         val creamAmount: Int)

//fun askCoffeeDetails(){
//    println("Who is the coffee for ? ")
//    val name = readln()
//    println("How many pieces of sugar do you want ?")
//    val sugarCountInt = readln().toInt()
//
//    //makeCoffee(sugarCountInt,name)
//}
// Define The Function
fun makeCoffee(coffeeDetails: coffeeDetails){

    if (coffeeDetails.sugarCount in 1..3){
        println("Coffee with ${coffeeDetails.sugarCount}" +
                "spoon of Sugar for ${coffeeDetails.name} Ans Cream: "+
                "${coffeeDetails.creamAmount}")
    }

    else if (coffeeDetails.sugarCount == 0){
        println("Coffee With No Sugar for ${coffeeDetails.name} And Cream: "+
                "${coffeeDetails.creamAmount}")
    }

    else {
        println("Coffee With ${coffeeDetails.sugarCount}"+
                "spoons of Sugar for ${coffeeDetails.name} And Cream: "+
                "${coffeeDetails.creamAmount}")
    }

}

fun main(){

    val Coffee = coffeeDetails(0,"Gourab","xxl",5)
    makeCoffee(Coffee)
}