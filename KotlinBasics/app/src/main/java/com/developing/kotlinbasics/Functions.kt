package com.developing.kotlinbasics

fun main(){


    println("Introduce a number: ")

    var numberStr1 = readln()

    var numberInt1 = numberStr1.toInt() // the readLine() function returns a String. Let's convert the user input (which is a string) into integers so we can perform arithmetic operations on them.

    var numberDoub1 = numberStr1.toDouble()


    println("Introduce another number: ")

    var numberStr2 = readln()

    var numberInt2 = numberStr2.toInt() // the readLine() function returns a String. Let's convert the user input (which is a string) into integers so we can perform arithmetic operations on them.

    var numberDoub2 = numberStr2.toDouble()




    var myResult = add(numberInt1, numberInt2)


    // print out the result in a user-friendly format.

    println("the result 1 is: " + myResult)

    println("the result 2 is: $myResult")

    println("the result 3 is: " + add2(numberInt1, numberInt2))



    var myResultDiv = divide(numberInt1, numberInt2)


    // print out the result in a user-friendly format.

    println("The result of the division is: $myResultDiv")




    var myResultDiv2 = divide2(numberDoub1, numberDoub2)


    // print out the result in a user-friendly format.

    println("The result of the second division is: $myResultDiv2")




}



// This is a function which returns a type Int number

fun add (num1: Int, num2: Int):Int{

    val result = num1 + num2

    return result // It has to return a type Int variable

}


// This is another function which returns a type Integer number

fun add2(num1: Int, num2: Int): Int {

    return num1 + num2 // It has to return a type Int variable

}



// This is another function used to divide two numbers from each other and returns a type Double number

fun divide(num1: Int, num2: Int): Double {

    val result = num1 / num2.toDouble() // Both numbers have to be converted to double

    return result  // It has to return a type Double variable

}



// This is another function used to divide two numbers from each other and returns a type Double number

fun divide2(num1: Double, num2: Double): Double {

    val result = num1 / num2// Both numbers have to be converted to double

    return result  // It has to return a type Double variable

}