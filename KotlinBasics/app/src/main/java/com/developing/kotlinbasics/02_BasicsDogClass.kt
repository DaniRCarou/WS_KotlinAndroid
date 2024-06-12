package com.developing.kotlinbasics

fun main(){


    /*
    - This is a multiline comment
    - This is another comment
    */


    // Objects/Instances of the class Dog are created


    // name: "Conny", breed: "Rottweiler"-> are properties I create at the class Dog. The third property is not entered, but it will be created with a '0' value in the class Dog, at the beginning

    var conny = `01_DogClass`("Conny", "Rottweiler")



    // name: "Sita", breed: "Palleiro" and age: 7-> are properties I create at the class Dog. The third property 'age: 7' is entered in this case.

    var sita = `01_DogClass`("Sita","Palleiro",7)




    // Now you can access to the PROPERTIES (NOT PARAMETERS) of the dog, only by writing a point after variable's name, 'conny'
    // If you want to do string manipulation with variables or properties of classes, you need to add the curly brackets, because otherwise it wouldn't know when the name of this variable is ending
    // If you don´t give a value or overwrite the value of one property, the property will still exist

    println("${conny.name} is a ${conny.breed} and is ${conny.age} old")

    println("${sita.name} is a ${sita.breed} and is ${sita.age} old")






    // Now the age of Sita is changed

    println("\nTwo years have passed!!\n")

    sita.age = 9 // The property 'age' can be changed because it was entered as a 'var' in the class Dog. However the property 'name' was entered as a 'val' in the class Dog

    // Checking the new result

    println("${sita.name} is a ${sita.breed} and now is ${sita.age} old")



}