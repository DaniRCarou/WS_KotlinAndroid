package com.developing.bankaccountprogramm

fun main(){

    // A bank account is created

    val daniBankAccount = BankAccount("Dani Carou", 10000.00)

    // it is deposited 200.0 because the data type is Double

    daniBankAccount.deposit(200.0)

    // Now let´s get the transaction history

    daniBankAccount.displayTransactionHistory()

    // it is deposited 100.0 because the data type is Double

    daniBankAccount.deposit(100.0)

    // Now let´s get the transaction history

    daniBankAccount.displayTransactionHistory()

    // it is deposited 400.0 because the data type is Double

    daniBankAccount.deposit(405.0)

    // it is withdrew 400.0 because the data type is Double

    daniBankAccount.withdraw(333.15)

    // Now let´s get the transaction history

    daniBankAccount.displayTransactionHistory()

    // To get the transaction history and Index

    daniBankAccount.displayTransactionHistoryAndIndex()



    // To get the total amount that it still has the account we can use directly the attributes from the class BankAccount -> class BankAccount(var accountHolder: String, var balance: Double)

    println("${daniBankAccount.accountHolder}'s balance is: ${daniBankAccount.balance}")


    // To get the total amount that it still has the account we can use the 'acctBalance' function

    daniBankAccount.acctBalance()





}