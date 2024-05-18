package com.developing.kotlinbasics


// It is possible to create an independent Data class or include it inside of the other class.
// The difference is that in the first case it is possible to access to de data from another classes and
// The second case it is only possible to access this data for the same class.



// 1. In this case I will create it inside of this File, so it is only accessible from this File.

data class CoffeeDetails(
    val sugarCount: Int,
    val name: String,
    val size: String,
    val creamAmount: Int
)


fun main(){

// 2. Now I will create a new variable

    val coffeeForMe = CoffeeDetails(2, "Me", "L", 0)


// 4. Coffee is made

    makeCoffee(coffeeForMe)


}


// 3. You can pass objects as parameters in functions
// In this case, we can introduce as a parameter, de data class 'coffeeDetails' created in this File.

fun makeCoffee(coffeeDetails: CoffeeDetails){

    println("\n" + "-----STARTING-----")



    if(coffeeDetails.sugarCount == 0){

        println("Coffee, size: ${coffeeDetails.size}, with no sugar and cream: ${coffeeDetails.creamAmount}, for ${coffeeDetails.name}") // Between curly brackets -> ${coffeeDetails.name}

    }else if(coffeeDetails.sugarCount == 1){

        println("Coffee, size: ${coffeeDetails.size}, with ${coffeeDetails.sugarCount} spoon of sugar and cream: ${coffeeDetails.creamAmount}, for ${coffeeDetails.name}") // Between curly brackets -> ${coffeeDetails.sugarCount}

    }else

        println("Coffee, size: ${coffeeDetails.size}, with ${coffeeDetails.sugarCount} spoons of sugar and cream: ${coffeeDetails.creamAmount}, for ${coffeeDetails.name}")

}






fun askCoffeeDetails(){

    println("Who is the coffee for?")

    var name = readln()


    println("How many pieces of sugar do you want?")

    var sugarCount = readln()
    var sugarCountInt = sugarCount.toInt()



    // 2. Here it will be called the function makeCoffee()

    // makeCoffee(coffeeDetails)



}