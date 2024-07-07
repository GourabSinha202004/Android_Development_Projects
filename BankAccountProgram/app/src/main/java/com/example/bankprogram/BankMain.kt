package com.example.bankprogram

fun main(){

    val gourabBankAccount = BankAccount("Gourab Sinha",21000.90)
    println()
    println("Total Amount Before Deposit And WithDrawl from ${gourabBankAccount.accountHolder} $${gourabBankAccount.acctBalance()}")
    gourabBankAccount.deposit(3000.00)
    gourabBankAccount.deposit(5000.10)
    gourabBankAccount.withDrawl(2000.90)
    gourabBankAccount.transactionHistory()
    val accountBalance = gourabBankAccount.acctBalance()
    println("Total Amount In Bank Account NOW -- $$accountBalance")
    println()
    val sagnikBankAccount = BankAccount("Sagnik Sinha",00.00)
    println()
    println("Total Amount Before Deposit And WithDrawl from ${sagnikBankAccount.accountHolder} $${sagnikBankAccount.acctBalance()}")
    sagnikBankAccount.deposit(100.00)
    sagnikBankAccount.withDrawl(10.00)
    sagnikBankAccount.deposit(300.00)
    sagnikBankAccount.transactionHistory()
    println("Total Amount After Deposit And WithDrawl from ${sagnikBankAccount.accountHolder} $${sagnikBankAccount.acctBalance()}")
}