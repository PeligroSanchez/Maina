package com.example.e_site

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.example.e_site.ui.theme.EsiteTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Demo()
        }
    }
}

@Composable
fun Demo(){

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray)
    ){

        Text(
            text = "AirTravel" ),
            fontSize = 70.sp,
            color = Color.DarkGray,
            fontFamily = FontFamily.Cursive,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.fillMaxSize(),
            textAlign = TextAlign.Center

        )
        Text(
            text = "AirTravel is an application that guides tourists to their destination",
            fontSize =  20.sp,
            fontWeight = FontWeight.Bold

        )
        Text(
            text = "Choose your vacation destination"
            fontWeight = FontWeight.Bold,
            modifier = Modifier.fillMaxSize(),
            textAlign = TextAlign.Center

        )
        Text(
            text = "AirTravel is an application that guides tourists"
        )
    }
}












































































@Composable
@Preview
fun DemoPreview(){
    Demo()
}


