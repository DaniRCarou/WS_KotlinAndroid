package com.developing.kotlinbasics



// Parameter -> name: String     -> that means this is just information it is passed to this object.
// Property ->  val name: String -> That means this is a part of this object
// The properties and parameters are entered in the brackets at the beginning of the class, after the word 'Dog'
// The property 'var age: Int = 0' is initialized with a '0' value, so if you don´t give a value or overwrite the value of this property, the property will still exist with the original value.

class `01_DogClass`(val name: String, val breed: String, var age: Int = 0) {



    // An initializer is needed to call a function. It is some code that will be executed the moment an object of this class is created

    init{

        bark(name)

    }



    fun bark(name: String){

        println("The dog $name is barking")

    }





}