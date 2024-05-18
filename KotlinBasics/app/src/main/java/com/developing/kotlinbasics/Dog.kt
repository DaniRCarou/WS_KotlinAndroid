package com.developing.kotlinbasics


// Parameter -> name: String     -> that means this is just information it is passed to this object.
// Property ->  val name: String -> That means this is a part of this object


class Dog(val name: String,val breed: String) {



    // An initializer is needed to call a function. It is some code that will be executed the moment an object of this class is created

    init{

        bark(name)

    }



    fun bark(name: String){

        println("The dog $name is barking")

    }





}