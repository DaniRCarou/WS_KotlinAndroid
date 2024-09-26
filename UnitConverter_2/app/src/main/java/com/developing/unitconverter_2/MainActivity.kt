package com.developing.unitconverter_2

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
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
    
    Column {

        // HERE ALL THE UI ELEMENTS WILL BE STOCKED BELOW EACH OTHER

        Text(text = "Unit Converter") // The minimum requirement that a text composable has is the content of that text property
        
        OutlinedTextField(value = "" , onValueChange = {})    // onValueChange, is something that should be executed the moment that we change the value.
                                                                // onValueChange = {} -> nothing should happen, when the Value of the OutlinedTextField changes, I could use this, if I don´t need to implement it yet.
                                                                // {} ->  This is an anonymous function (local final fun `<anonymous>`), which is a function that doesn't have a name. So we cannot call it, but it can still be executed.


        Row {


            // the context means in which area of the application should something happens.
            // I decide it should be within a composable function, inside of the local context of my current composable, unit converter.
            // the word LocalContext could be wrote in red, means that it has to be imported.
            // Just put the file over the text LocalContext and it will be displayed a text where you can click to import it
            val context = LocalContext.current

        // HERE ALL THE UI ELEMENTS WILL BE STACKED NEWT TO EACH OTHER

            // Inside of the toast it will be wrote "Thanks for clicking", after that it will be wrote the long of the toast. 1. Toast.Length_long or 2. Toast.Length_short.
            // At the end it has to be wrote ".show()"
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

            }


            Box {

                Button(onClick = { /*TODO*/ }) {

                    Text("Select")

                    Icon(Icons.Default.ArrowDropDown, contentDescription = "Arrow Down")

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