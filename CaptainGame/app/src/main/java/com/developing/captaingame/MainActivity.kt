package com.developing.captaingame

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue

import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.developing.captaingame.ui.theme.CaptainGameTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CaptainGameTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                   CaptainGame()




                }
            }
        }
    }
}


// 1
// It is necessary to import the remember function and mutableStateOf function (This last one has to be changed because it will be used numbers)
@Composable
fun CaptainGame(){


    // 2
    // val -> can not be changed, but when it is worked with 'remember' stages, it is not changed what I am writing inside of the direction or treasuresFound variables.
    // but it is changed what the direction and treasuresFound variables internally are.
    // This means that the value of treasuresFound and direction can be modified without needing to change the reference to the variable.
    // The variable itself (treasuresFound and direction) is not changing reference; that is, it always points to the same state object.
    //       val treasuresFound = remember { mutableIntStateOf(0) }
    //
    //13
    // Another option to write the variable treasuresFound.
    // It has to be imported operators 'intState.getValue', 'State.getValue'.
    // This allows to get the value directly and it is not necessary to write  ' Text("Treasures Found: ${treasuresFound.value}") ' at the end
    // Since treasuresFound is a val, the compiler doesn't allow modifying it directly with += 1.
    // This is because val implies an immutable reference, so attempting to change its value gives you the error "change to 'var'."
    // To fix this issue, you need to change val to var in the declaration of treasuresFound when using by.
    // This allows treasuresFound to be mutable and makes the code for all buttons work correctly.
    // If the compiler is indicating that you should use mutableIntStateOf, it’s because you are using a var with a specific data type (in this case, Int).
    // In Compose, mutableIntStateOf is optimized for handling integer (Int) values directly within the Compose state system and is more efficient than mutableStateOf in some contexts.
    var treasuresFound by remember { mutableIntStateOf(0) }



    // 3
    val direction = remember { mutableStateOf("North") }


    //11
    val stormOrTreasure = remember { mutableStateOf("") }



    // 4
    Column {

        // 5
        // treasuresFound.value -> In order to access the value of treasures found, which is a mutable state of type int, it is necessary to use the variable name and then dot value.
        // This allows to access the value of treasuresFound variable.
        Text("Treasures Found: ${treasuresFound}")



        // 6
        Text("Treasures Found: ${direction.value}")



        //12
        Text("${stormOrTreasure.value}")



        // 7
        // Button has to be imported as a composable button
        // This Button change the direction, instead of saying East
        // Random.nextBoolean() -> Depending on some luck factor, it will be displayed that eather the captain is sailing into a storm or he is sailing into a treasure
        // Random.nextBoolean() -> it gives a boolean value, which means either true(treasure) or false(storm).
        // Random is a class, it doesn't has to be imported
        Button(

            onClick = {

                direction.value = "East"

                if(Random.nextBoolean()){

                    treasuresFound +=1

                    stormOrTreasure.value = "Found a Tresure!"

                }else {

                    stormOrTreasure.value = "Storm ahead!"

                }

            }){ Text("Sail East")}


        // 8
        Button(

            onClick = {

                direction.value = "North"

                if(Random.nextBoolean()){

                    treasuresFound +=1

                    stormOrTreasure.value = "Found a Tresure!"

                }else {

                    stormOrTreasure.value = "Storm ahead!"

                }


            }){ Text("Sail North")}


        // 9
        Button(

            onClick = {

                direction.value = "West"

                if(Random.nextBoolean()){

                    treasuresFound +=1

                    stormOrTreasure.value = "Found a Tresure!"

                }else {

                    stormOrTreasure.value = "Storm ahead!"

                }

            }){ Text("Sail West")}




        // 10
        Button(

            onClick = {

                direction.value = "South"

                if(Random.nextBoolean()){

                    treasuresFound +=1

                    stormOrTreasure.value = "Found a Tresure!"

                }else {

                    stormOrTreasure.value = "Storm ahead!"

                }

            }){ Text("Sail South")}














    }












}