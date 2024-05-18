package com.developing.kotlinbasics

fun main(){

// An object/instance of the class Dog is created

    var conny = Dog("Conny", "Rottweiler") // name: "Conny" and breed: ""-> are parameters I create at the class Dog,



    // Now you can access to the PROPERTIES (NOT PARAMETERS) of the dog, only by writing a point abter the variable name "conny"
    // If you want to do string manipulation with variables or properties of classes, you need to add the curly brackets, because otherwise it wouldn't know when the name of this variable is ending


    println("${conny.name} is a ${conny.breed}")


}