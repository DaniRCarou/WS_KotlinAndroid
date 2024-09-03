package com.developing.kotlinbasics

import android.annotation.SuppressLint

@SuppressLint("SuspiciousIndentation")
fun main(){


    // This is an immutable list 'val' - You can not add items after the initialization

    val shoppingListI = listOf("Processor", "RAM", "Graphics Card", "SSD")





    // This is a mutable list 'var' - You can add items later and modify

    var shoppingListM = mutableListOf("Processor", "RAM", "Graphics Card RTX 3060", "SSD")









    // Adding items to lists
    // BY adding the 'dot', after 'shoppingListM', it appears all the methods you can use (They have a 'm' at the beginning).
    // Methods are functions in the context of objects
    // .add(element: String) - Enters another element in the list

    shoppingListM.add("Cooling System")


    // Now there is another item in the list

    println("1. $shoppingListM")



    // This is a method to remove an specific item by its name, from the list
    // add.(element: String) -> Remove an element by its name
    // add.(index: Int) -> Remove an element by its position

    shoppingListM.remove("Graphics Card RTX 3060")


    // Now there is no Graphic Card in the list

    println("2. $shoppingListM")




    // Adding a new Graphics Card to lists
    // BY adding the 'dot', after 'shoppingListM', it appears all the methods you can use (They have a 'm' at the beginning).
    // Methods are functions in the context of objects
    // .add(element: String) - Enters another element in the list

    shoppingListM.add("Cooling System")


    // Now there is a new Graphics Card in the list

    println("3. $shoppingListM")












    // In a list, every item has a position. from '0' to 'Amount of memory available in the system'
    // So it is possible to add or remove an item by its index
    // Let´s remove it by using '.removeAt()'

    shoppingListM.removeAt(2)



    // Now there is no SSD in the list

    println("4. $shoppingListM")



    // Removing the RAM

    shoppingListM.removeAt(1)


    // Now there is no RAM in the list

    println("5. $shoppingListM")




    // Let´s add the RAM by using '.add(Index: Int, element: String)'

    shoppingListM.add(2,"RAM")

    // Now there is a RAM in the list again

    println("6. $shoppingListM")




    // It is possible to access items inside of the list at a particular index

    println("7. ${shoppingListM[2]}")





    // It is possible to modify an item

    shoppingListM[3] = "Graphics Card RX 7800XT"


    println("8. $shoppingListM")






    // To replace an item it is used the 'set()' method

    shoppingListM.set(1,"Water Cooling")

    println("9. $shoppingListM")

    // Kotlin with a certain version prefers to use an indexing operator

    shoppingListM[1] = "Water Cooling"

    println("10. $shoppingListM")






    // CONTAINS METHOD allows to check if our list contains a particular item -> contains(element: String)
    // It returns a type which is boolean

    val hasRam = shoppingListM.contains("RAM")


    // One way to print it

    println("11. $hasRam")


    // Another way to print it

    if(hasRam){

        println("12. The RAM is in the list")

    }else

    println("1. No RAM in the list")



    // Another way to print it. This one without using a variable previously

    if(shoppingListM.contains("RAM")){

        println("13. I told you, the RAM is in the list")

    }else {

        println("No RAM in the list")
    }







    // Loop which allows us to loop through a list and do something with every single item in the list or just take an specific item
    // On this case we are going to print every single item

    print("\n14. \n") // -> If I use this 'print' there is no line break with the next 'println()'

    for(item in shoppingListM){

        println(item)

    }





    // It is possible to run this loop until I get to the RAM

    print("\n15. \n")

    for(item in shoppingListM){

        println(item)

        if(item == "RAM"){

            break


        }


    }





    // It is possible to run this loop until I get to the RAM

    print("\n16. \n")

    for(item in shoppingListM){

        println(item)

        if(item == "RAM"){

            shoppingListM.removeLast()

            break

        }



    }



    println("\n17. $shoppingListM")










    print("\n18. \n")

    shoppingListM.removeLast()

    for(item in shoppingListM){

        println(item)

    }


    println("\n19. $shoppingListM")







    // To get the index of an item in the list or to get access to the index to do something else with it

    println("\n20. Size: " + shoppingListM.size)

    for(index in 0 until shoppingListM.size){

        println("The ${shoppingListM[index]} is at index $index")

    }



    // To get the index of an item in the list or to get access to the index to do something else with it

    println("\n21. Size: " + shoppingListM.size)

    for(index in 0 until 1){

        println("The ${shoppingListM[index]} is at index $index")

    }




    // To get the index of an item in the list or to get access to the index to do something else with it

    println("\n22. Size: " + shoppingListM.size)

    for(index in 0 .. 1){

        println("The ${shoppingListM[index]} is at index $index")

    }


























}