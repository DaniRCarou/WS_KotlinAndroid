package com.developing.bankaccountprogramm



// A class is created with the constructor with two Atributes, accountHolder and balance.

class BankAccount(var accountHolder: String, var balance: Double) {



    // 4. We have to create a variable which contains the transaction history, called 'transactionHistory'

    // 4.1 This will be a mutable list of Strings,
    // so we have to define the data type because if you don´t define it, the list wouldn't know of which type it is, which is why it is used these brackets.

    // 4.2 Otherwise, it is possible not define the type if you wrote inside of the brackets. For example: private val transactionHistory = mutableListOf<>("")
    // By writing ' ("") ', I would indicate the list would contain a String data type.

    // 4.3 'private' keyword is used to change the accessibility of this variable.
    // So it is not possible to access transaction history,
    // because this variable is now not accessible to me from outside of the BankAccount class as it is private.
    // Thereby, the transactionHistory is safe and it is only possible to access it through the functions of the BankAccount class.
    // So it cannot be directly modified. It is  only possible through the functions.
    private val transactionHistory = mutableListOf<String>()






    // FEATURES I WANT TO HAVE IN A BANK ACCOUNT
    // Start with the function's name and at the end, write the functionality code inside



    // What we can do with a Bank Account is:
    // 1. Deposit money

    fun deposit(amount: Double){

        balance += amount // The amount attribute is modified.  You can also write: balance = balance + amount

        transactionHistory.add("$accountHolder deposited $$amount") // The TransactionHistory is modified

    }







    // What we can do with a Bank Account
    // 2. Withdraw money

    fun withdraw(amount: Double){

        if(amount <= balance ){

            // If the amount is less equal balance, then we can withdraw money

            balance -= amount // The amount attribute is modified. You can also write: balance = balance - amount

            transactionHistory.add("$accountHolder withdrew $$amount") // The TransactionHistory is modified


        } else{

            // Else, we can not withdraw money

            println("It is not possible to withdraw money. Not enough funds")

        }

    }







    // What we can do with a Bank Account
    // 3. Display all transactions. We have to create a variable which contains the transaction history, called 'transactionHistory'

    fun displayTransactionHistory(){

        println("\nTransaction history for $accountHolder: ")

        // You have to go through the list of transactions which contains the variable 'transactionHistory'
        // 'transaction' is a variable we create for the buckle 'for' which will contain every transaction inside of the 'transactionHistory' list

        for(transaction in transactionHistory){

            println(transaction)

        }


    }







    // What we can do with a Bank Account
    // 5. Display all transactions and index.

    fun displayTransactionHistoryAndIndex(){

        println("\nTransaction history for $accountHolder: ")

        // You have to go through the list of transactions which contains the variable 'transactionHistory'
        // 'transaction' is a variable we create for the buckle 'for' which will contain every transaction inside of the 'transactionHistory' list

        for(index in 0  until transactionHistory.size){

            println("Transaction ${index + 1}: ${transactionHistory[index]}") // ${index + 1} -> curly brackets are very important to do an operation

        }


    }





    // to print the balance of an account holder it is created

    fun acctBalance(){

        println("$accountHolder's balance is: $balance")

    }








}