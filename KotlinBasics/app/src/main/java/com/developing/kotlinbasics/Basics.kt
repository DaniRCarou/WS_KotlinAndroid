package com.developing.kotlinbasics


// This is the main function, the entry point of my program. This gives my program an entry point.
// fun -> function. This is the kotlin keyword for function.
// main -> This is the main function, which starts with a lower letter.
// () rounded brackets for additional information
// {} curly brackets inside of those curly brackets, that´s where the code is going to go.

fun main(){


    println("1. Hello, world!!!") // This is how I would show a sentence.




    // val -> For constant variables. It is not possible to change it after the fact or after assigning. They are immutable, it is essentially to read.

    val number1 = 1




    // var -> It is a variable that it could be changed latter.

    var myAge = 41

    println("2. At the beginning, my age is: $myAge")

    // It is possible to override it because is a mutable reference

    myAge = 42

    println("3. At the end, my age is: $myAge") /* 'String' concatenation can be converted to a template -> println("My Age is: $myAge") */






    /*
    By default numbers are stored as integers or as Long, depending on the number you write, unless you override the type.
    If you don´t need to store a big number, for example your age, because it is impossible to get older than 127 (which is the highest number that I can use for a byte),
    just use a byte type for this variable.

    If at the beginning the number was stored as an Integer and after that the number is getting longer,
    it would appear an error because the number is longer and it was stored as an Integer at the beginning.

    More information: https://kotlinlang.org/docs/numbers.html
    */

    var yourAge : Byte = 35




    // var pi : Float = 3.14 -> var pi = 3.14f   --> It is the same (32 bits)
    // var pi = 3.1415926535 -> It is stored as a double (64 bits), more precise

    var pi = 3.1415926535

    println("4. $pi")




    // Unsigned integer types -> They are not negative numbers. For example: UByte -> 0-255

    var car : UShort = 35u

    println("5. $car")




    // Booleans

    val myTrue: Boolean = true
    val myFalse: Boolean = false
    val boolNull: Boolean? = null

    println(myTrue || myFalse) // True

    println("5. ${myTrue || myFalse}")

    println("6. " + (myTrue || myFalse))


    println(myTrue && myFalse) // False

    println("7. ${myTrue && myFalse}")

    println("8. " + (myTrue && myFalse))


    println(!myTrue) // False

    println("9. ${!myTrue}")

    println("10. " + (!myTrue))


    println(boolNull) // Null

    println("11. $boolNull")

    println("12. $boolNull")





    // Characters

    /*
    The type Char can only store one character -> '1'
    It is not used double quotations for a Char type variable
    Double quotations will be used in strings
     */

    val myChar = 'a'

    println("13. $myChar")


    /*
    It is possible to store a Unicode in a Char type variable
    It has to be added a '\' at the beginning of the special character
    The copyright sign -> 'U+00AE' in Wikipedia
     */

    val yourChar = '\u00AE'

    println(yourChar)

    val yourChar2 = '\\'

    println(yourChar2)






    // Strings

    /*
    String variable allows to store a set of characters and basically
    words and also paragraphs and very long texts, by using the quotations -> ("")
     */

    var name = "Dani"

    name = "FERNANDO GONZALEZ LOPEZ"

    println(name)

    var lastName = "Rodriguez"

    /*
    It is possible to use certain functions on to strings.
    Objects allow to run functions of them.
    So, functions in combination with objects are methods.
    lowercase() -> is a method which can be executed on strings.
    */

    println(name.lowercase())






    // EXAMPLES TO PRINT


    println(name + " is my friend")

    var name2 = "Dani"

    println(name2 + lastName + " is very funny"  )


    println(name2 + " is my friend" + "\t " + lastName)







    // If else statements
    // Comparison operators: Greater than (>), Equal to (==), Less than (<), Greater than or equal to (>=), Lower than or equal to (<=)

    var age = 41

    if(age >= 18){

        println("You can go into the club")

    }else{

        println("You too young to go into the club")

    }







    // Readln and toInt to convert strings into int variables, when the user entered a string into the console

    println("Just try to introduce a number")

    age = readln().toInt()

    println("Please enter your  age as a full number")

    var enteredValue = readln()

    age = enteredValue.toInt()

    if(age >= 18){

        println("You can go into the club")

    }else{

        println(enteredValue + " You too young to go into the club")

    }






    // Else if and the in keyword

    println("Just try to introduce a number")

    var number = readln()

    var numberInt = number.toInt()

    if(numberInt >= 40){

        println("You can not go into the club")

    }else if(numberInt >= 18){

        println(number + " You can go into the club")

    }else{

        println(number + " You can not go into the club")

    }





    // Another example

    if(numberInt in 18..39){ // The syntax for a range is startValue..endValue. To do this, you have to write: numberInt in 18 .. 39 -> iT would do it automatically

        println("You can go into the club")

    }else if(numberInt >= 40){

        println(number + " You can not go into the club")

    }else{

        println(number + " You can not go into the club")

    }

















}