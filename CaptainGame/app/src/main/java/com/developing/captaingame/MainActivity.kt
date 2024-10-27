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
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
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
    val treasuresFound = remember { mutableIntStateOf(0) }

    // 3
    val direction = remember { mutableStateOf("North") }

    // 4
    Column {

        // 5
        // treasuresFound.value -> In order to access the value of treasures found, which is a mutable state of type int, it is necessary to use the variable name and then dot value.
        // This allows to access the value of treasuresFound variable.
        Text("Treasures Found: ${treasuresFound.value}")


        // 6
        Text("Treasures Found: ${direction.value}")



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

                   treasuresFound.value +=1

                }


        }){ Text("Sail East")}


        // 8
        Button(

            onClick = {

                direction.value = "North"

                if(Random.nextBoolean()){

                    treasuresFound.value +=1

                }


            }){ Text("Sail North")}


        // 9
        Button(

            onClick = {

                direction.value = "West"

                if(Random.nextBoolean()){

                    treasuresFound.value +=1

                }


            }){ Text("Sail West")}




        // 10
        Button(

            onClick = {

                direction.value = "South"

                if(Random.nextBoolean()){

                    treasuresFound.value +=1

                }


            }){ Text("Sail South")}














    }












}