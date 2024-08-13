package com.example.realestate.ui.theme.screens.home


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.realestate.R
import com.example.realestate.navigation.ROUT_DETAIL
import com.example.realestate.navigation.ROUT_HOME
import com.example.realestate.ui.theme.Lightpink40


@Composable
fun HomeScreen(navController: NavController){

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Lightpink40),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,


    ){
        //Lottie Animation
        val composition by rememberLottieComposition(spec = LottieCompositionSpec.RawRes(R.raw.manager))
        val progress by animateLottieCompositionAsState(composition)
        LottieAnimation(
            composition, progress,
            modifier = Modifier.size(300.dp)
        )


        Text(
            text = "MagicBricks",
            fontSize = 60.sp,
            fontFamily = FontFamily.Cursive,
            color = Color.Magenta

        )

        Text(
            text =  "Your better choice",
            fontSize = 20.sp,)

        Spacer(modifier = Modifier.height(100.dp))


        Button(onClick = { navController .navigate(ROUT_DETAIL) },
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .padding(start = 20.dp, end = 20.dp),
            colors = ButtonDefaults.buttonColors(Color.DarkGray)
        ){
            Text(text = "Get started")

        }




    }



}

@Composable
@Preview(showBackground = true)
fun HomeScreenPreview(){

    HomeScreen(rememberNavController())

}

