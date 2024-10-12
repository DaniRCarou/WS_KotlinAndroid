package com.developing.unitconverter_2

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.developing.unitconverter_2.ui.theme.UnitConverter_2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UnitConverter_2Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    UnitConverter()

                }
            }
        }
    }
}





// 1. My own composable
@Composable
fun UnitConverter(){



    
    // Column (modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally )
    // -> modifier -> when working with Jetpack Compose, the term Modifier refers to an object that allows you to modify or decorate UI elements (composables) in a flexible and declarative way.
    // -> fillMaxSize takes the entire space
    // -> verticalArrangement -> How you want your column to be arranged. It will be showed in the middle of the screen on the left side
    // -> horizontalAlignment -> Allows to align the element horizontally
    Column (modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally){







        // HERE ALL THE UI ELEMENTS WILL BE STOCKED BELOW EACH OTHER

        Text(text = "Unit Converter", modifier = Modifier.padding(100.dp)) // The minimum requirement that a text composable has is the content of that text property

        // Spacer option -> is a composable which adds empty space between other elements without the need to use margins or padding on specific components.
        // You can copy and paste this sentence everywhere you want to keep this distance
        // 16.dp -> 16.density-independent pixel, It is a unit of measurement used in Android UI design to ensure that UI elements maintain consistent proportions and sizes across devices with varying screen densities. One dp is considered equal to one pixel on a screen with a density of 160 dpi (dots per inch).
        // ----- Spacer(modifier = Modifier.height(16.dp)) -----








        OutlinedTextField(value = "" , onValueChange = {})    // onValueChange, is something that should be executed the moment that we change the value.
                                                              // onValueChange = {} -> nothing should happen, when the Value of the OutlinedTextField changes, I could use this, if I don´t need to implement it yet.
                                                              // {} ->  This is an anonymous function (local final fun `<anonymous>`), which is a function that doesn't have a name. So we cannot call it, but it can still be executed.






        // Spacer option -> is a composable which adds empty space between other elements without the need to use margins or padding on specific components.
        // You can copy and paste this sentence everywhere you want to keep this distance
        // 16.dp -> 16.density-independent pixel, It is a unit of measurement used in Android UI design to ensure that UI elements maintain consistent proportions and sizes across devices with varying screen densities. One dp is considered equal to one pixel on a screen with a density of 160 dpi (dots per inch).
        Spacer(modifier = Modifier.height(16.dp))








        Row {

            // In order to display a toast, we need the context of where the toast should be displayed.
            // So this now gives the local context that we're going to need whenever we want to use a toast.
            // The context means in which area of the application should something happens.
            // I decide it should be within a composable function, inside of the local context of my current composable, unit converter.
            // the word LocalContext could be wrote in red, means that it has to be imported.
            // Just put the mouse pointer over the text LocalContext and it will be displayed a text where you can click to import it
            val context = LocalContext.current




            // In order to write a toast we can use this toast class. 'Toast' (This class will be automatically imported ) and call the method '.makeText' where we need to pass some details in.
            // The duration and the context at first. So let's pass the context that we just created earlier. Then we need to pass the text that we want to display.
            // And then I need to add an integer which says how long the toast should be displayed.
            // Inside of the toast it will be wrote "Thanks for clicking", after that it will be added an integer which says how long the toast should be displayed.. 1. Toast.Length_long or 2. Toast.Length_short.
            // In order to show it, in order to display it, it is needed to write at the end the method '.show()' of the class Toast.
            Button(onClick = { Toast.makeText(context,"Thanks for clicking", Toast.LENGTH_LONG).show() }) {

            Text(text = "Click here") // Text within the botton





            }


        }











        // You can't write the word text: inside of the parentheses, just write the text between quotation marks-> (text:"Result")

        Text("Result:")














        Row{




            Box {



                Button(onClick = { /*TODO*/ }) {

                    Text("Select")

                    // Icon, is a Jetpack Compose component used to display an icon on the screen. It is part of the Material Design library and can be customized in various ways. It has to be imported the @composable icon, because I am working with @Composables
                    // Icons, is an object that contains a collection of predefined icons provided by Material Design. It is organized into different categories and allows you to easily access various standard icons for use in your application. (Class, like a summary of icons) has to be imported too
                    // Default, is a subcategory within the Icons object. It contains commonly used icons that are widely applicable across different types of apps. Default serves as a namespace to group these standard icons.
                    // ArrowDropDown, is the specific name of the icon within Icons.Default. It represents a downward-pointing arrow, commonly used in dropdown menus or to indicate that more options are available when an element is clicked.

                    // contentDescription, is an optional parameter that provides a textual description of the icon.
                    // in this case, the contentDescription is set to an empty string. This typically indicates that the icon is purely decorative and does not convey any important information. Setting it to an empty string tells accessibility tools to ignore the icon, so it won’t be announced to users with screen readers.
                    Icon(Icons.Default.ArrowDropDown, contentDescription = "Arrow Down")




                }

                // In compose, the DropdownMenu component enables the creation of other option selector.
                // It's a like a menu and can display a list of choice using its child element drop down menu item.
                // And we have already provided a container and a trigger for it, although not functioning, so the trigger ("disparador" o "gatillo") will be the button click event that we have.
                // expanded -> is boolean, so it has to contains true (the menu is initially open) or false (the menu is initially closed)
                // onDismissRequest -> Is the callback when the menu is dismissed.
                DropdownMenu(expanded = false, onDismissRequest = { /*TODO*/ }) {

                    // Here will be added the DropdownMenu items.
                    // We can have a text for the drop down menu item and an onClick event that we can define.
                    DropdownMenuItem(text = { Text(text = "Centimeters")}, onClick = { /*TODO*/ })

                    DropdownMenuItem(text = { Text(text = "Meters")}, onClick = { /*TODO*/ })

                    DropdownMenuItem(text = { Text(text = "Feet")}, onClick = { /*TODO*/ })

                    DropdownMenuItem(text = { Text(text = "Milimeters")}, onClick = { /*TODO*/ })

                }



            }






            // Spacer option -> is a composable which adds empty space between other elements without the need to use margins or padding on specific components.
            // You can copy and paste this sentence everywhere you want to keep this distance
            // 16.dp -> 16.density-independent pixel, It is a unit of measurement used in Android UI design to ensure that UI elements maintain consistent proportions and sizes across devices with varying screen densities. One dp is considered equal to one pixel on a screen with a density of 160 dpi (dots per inch).
            // Spacer(modifier = Modifier.height(16.dp))
            Spacer(modifier = Modifier.width(16.dp))







            Box {



                Button(onClick = { /*TODO*/ }) {

                    Text("Select")

                    Icon(Icons.Default.ArrowDropDown, contentDescription = "Arrow Down")

                }

                // In compose, the DropdownMenu component enables the creation of other option selector.
                // It's a like a menu and can display a list of choice using its child element drop down menu item.
                // And we have already provided a container and a trigger for it, although not functioning, so the trigger ("disparador" o "gatillo") will be the button click event that we have.
                // expanded -> is boolean, so it has to contains true (the menu is initially open) or false (the menu is initially closed)
                // onDismissRequest -> Is the callback when the menu is dismissed.
                DropdownMenu(expanded = true, onDismissRequest = { /*TODO*/ }) {

                    // Here will be added the DropdownMenu items.
                    // We can have a text for the drop down menu item and an onClick event that we can define.
                    DropdownMenuItem(text = { Text(text = "Centimeters") }, onClick = { /*TODO*/ })

                    DropdownMenuItem(text = { Text(text = "Meters") }, onClick = { /*TODO*/ })

                    DropdownMenuItem(text = { Text(text = "Feet") }, onClick = { /*TODO*/ })

                    DropdownMenuItem(text = { Text(text = "Milimeters") }, onClick = { /*TODO*/ })

                }


            }


        }

    }

}








// It is possible to write @Preview@Composable
@Preview(showBackground = true) // If I have the dark mode active, may be I should see the preview clearly at white, so you have to write "(showBackground = true)" after @Preview
@Composable
// fun UnitConverterPreview -> UnitConverter will be the composable I want to preview, and after that we have to add Preview
fun UnitConverterPreview(){

    UnitConverter()

}