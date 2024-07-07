package com.example.bankprogram

class BankAccount(var accountHolder: String, var balance: Double) {
    private val transactionHistory = mutableListOf<String>()

    fun deposit(amount: Double){
        balance += amount
        transactionHistory.add("$accountHolder Deposited $$amount")
    }

    fun withDrawl(amount: Double){
        if (amount<=balance) {
            balance -= amount
            transactionHistory.add("$accountHolder WithDrawl $$amount")
        } else {
            println("Not enough balance is available $$amount")
        }
    }

    fun transactionHistory(){
        println("Transaction History $accountHolder")
        for (t in transactionHistory){
            println(t)
        }
    }

    fun acctBalance(): Double {
        return balance
    }
}