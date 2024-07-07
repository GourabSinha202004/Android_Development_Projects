package com.example.rockpaperscissors

fun main(){
    var coumputerChoice = ""
    var playerChoice = ""
    println("Rock , Paper OR Scissors? Enter Your Choice")
    playerChoice = readln()
    while (playerChoice == ""){
        println("Please Enter Your Choice")
        playerChoice = readln()
    }

    val randomNumber = (1..3).random()
    when (randomNumber) {
        1 -> {
            coumputerChoice = "Rock"
        }
        2 -> {
            coumputerChoice = "Paper"
        }
        3 -> {
            coumputerChoice = "Scissor"
        }
    }

    println(coumputerChoice)

    val winner = when{
        playerChoice == coumputerChoice -> "Tie"
        playerChoice == "Rock" && coumputerChoice == "Scissor" -> "Player"
        playerChoice == "Paper" && coumputerChoice == "Rock" -> "Player"
        playerChoice == "Scissor" && coumputerChoice == "Paper" -> "Player"

        else -> "Computer"
    }

    if (winner == "Tie"){
        println("Tie....")
    } else{
        println("$winner Wins!!!")
    }
}