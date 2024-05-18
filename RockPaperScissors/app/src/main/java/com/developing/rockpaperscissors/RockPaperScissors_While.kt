package com.developing.rockpaperscissors

fun main(){


    var computerChoice = ""
    var playerChoice = ""




// 1. PLAYER´S CHOICE -> Enter an element



    println("Rock, Paper or Scissors? Enter your choice")

    playerChoice = readln().lowercase()

    while((playerChoice != "rock" && playerChoice != "r") && (playerChoice != "paper" && playerChoice != "p") && (playerChoice != "scissors" && playerChoice != "s")){

        println("Rock, Paper or Scissors? Enter your choice")

        playerChoice = readln().lowercase()


    }


    // 2. Added




    if (playerChoice == "Rock" || playerChoice == "r"){

        playerChoice = "Rock"

    }else if (playerChoice == "Scissors" || playerChoice == "s"){

        playerChoice = "Scissors"

    }else if (playerChoice == "Paper" || playerChoice == "p"){

        playerChoice = "Paper"

    }


    println("\n" + "Player´s choice is: " + playerChoice)






// 3. We will create a random number


    // The random function can be applied on a range, for example between 1 and 3

    val randomNumber = (1..3).random() // 1..3 -> convert automatically






// 4. Now you have to assign the value of the number to a game element



    // This could be one option
    /*
    if (randomNumber == 1){

        computerChoice = "Rock"

    }else if(randomNumber == 2){

        computerChoice = "Paper"

    }else{

        computerChoice = "Scissors"

    }

    print(computerChoice)
    */




    // But Android Studio recommends to use "when" statements with cascading numbers and comparisons.

    when (randomNumber) {
        1 -> {

            computerChoice = "Rock"

        }
        2 -> {

            computerChoice = "Paper"

        }
        else -> {

            computerChoice = "Scissors"

        }
    }

    // print(computerChoice + "\n")



// 5. Now we have to compare and execute accordingly

    val winner = when{

        playerChoice == computerChoice -> "Tie"

        playerChoice == "Rock" && computerChoice == "Scissors" -> "Player"

        playerChoice == "Paper" && computerChoice == "Rock" -> "Player"

        playerChoice == "Scissors" && computerChoice == "Paper" -> "Player"

        else -> "Computer"

    }



    println("\n" + "Computer´s choice is: " + computerChoice )


    println("\n" + "----------------------------------------------------")


    // One way to do it

    println("\n" + "The winner is: " + winner)



    // Another way to do it



    if(winner == "Tie"){

        println("\n" + "It´s a tie")

    }else if(winner == "Player"){

        println("\n" + "Player won!!!!")

    }else{

        println("\n" + "Computer won")

    }



    // Another way to do it


    if(winner == "Tie"){

        println("\n" + "It´s a tie")

    }else{

        println("\n" + "The winner is: The " + winner + "!!")

    }



    // Another way to do it


    if(winner == "Tie"){

        println("\n" + "It´s a tie")

    }else{

        println("\n" + "$winner won!!")

    }














}