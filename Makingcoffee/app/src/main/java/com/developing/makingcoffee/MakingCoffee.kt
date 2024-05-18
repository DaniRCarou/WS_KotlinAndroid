package com.developing.makingcoffee

fun main(){


    println("Who is the coffee for?")

    var name = readln()


    println("How many pieces of sugar do you want?")

    var sugarCount = readln()
    var sugarCountInt = sugarCount.toInt()



    // 2. Here it will be called the function makeCoffee()

    makeCoffee(sugarCountInt, name)





    // 3. Now the function makeCoffee can be called as many times as needed without having to rewrite the entire code containing the makeCoffee function.

        // makeCoffee(1, "Javi")

        // makeCoffee(2, "Jorge")










}


// 1. Here it will be defined the function
// By defining this function outside of the main method, it allows this function to be called as many times as desired throughout the main function.
// This function has to be called or executed from the main function by entering the name of the function
// sugarCount : int -> It is a parameter it has to be entered everytime we call this function

fun makeCoffee(sugarCountInt : Int, name : String){

    println("\n" + "-----STARTING-----")

    println("\n" + "Buy beans")

    println("Grind beans")

    println("Add water")

    println("Heat watter to 90 ºC")

    println("Push hot water through the ground beans")

    println("Enjoy it!")


    if(sugarCountInt == 0){

        println("Coffee with no sugar for $name")

    }else if(sugarCountInt == 1){

        println("Coffee with $sugarCountInt spoon of sugar for $name")

    }else

    println("Coffee with $sugarCountInt spoons of sugar for $name")

}



fun askCoffeeDetails(){

    println("Who is the coffee for?")

    var name = readln()


    println("How many pieces of sugar do you want?")

    var sugarCount = readln()
    var sugarCountInt = sugarCount.toInt()



    // 2. Here it will be called the function makeCoffee()

    makeCoffee(sugarCountInt, name)



}