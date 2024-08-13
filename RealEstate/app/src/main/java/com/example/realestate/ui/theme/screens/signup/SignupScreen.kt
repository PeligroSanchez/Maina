package com.example.realestate.ui.theme.screens.signup

import android.graphics.drawable.Icon
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.realestate.R
import com.example.realestate.navigation.ROUT_INTENT
import com.example.realestate.ui.theme.Lightpink40
import com.example.realestate.ui.theme.purple70
import androidx.compose.material3.Text as Text

@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun SignupScreen(navController: NavController){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        ){
        Spacer(modifier = Modifier.width(20.dp))
        Image(
            painter = painterResource(id = R.drawable.property), contentDescription = "property",
            modifier = Modifier
                .size(180.dp)
                .clip(shape = CircleShape),
            contentScale = ContentScale.Crop,
        )

        Spacer(modifier = Modifier.height(10.dp))

        Text(text = "Meadows",
            fontSize = 80.sp,
            fontFamily = FontFamily.Cursive,
            color = purple70,
            fontWeight = FontWeight.ExtraBold
        )
        Spacer(modifier = Modifier.height(10.dp))

        var name by remember{ mutableStateOf("") }
        var email by remember{ mutableStateOf("") }
        var password by remember{ mutableStateOf("") }
        var confpassword by remember{ mutableStateOf("") }

        OutlinedTextField(
            value = name,
            onValueChange ={ name = it },
            label = { Text(text = "Fullname") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            leadingIcon = { androidx.compose.material3.Icon(imageVector = Icons.Default.Person, contentDescription = "")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )
        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(
            value = email,
            onValueChange ={ email = it },
            label = { Text(text = "Email address") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            leadingIcon = { androidx.compose.material3.Icon(imageVector = Icons.Default.Email, contentDescription = "")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )
        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(
            value = password,
            onValueChange ={ password = it },
            label = { Text(text = "Password") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            leadingIcon = { androidx.compose.material3.Icon(imageVector = Icons.Default.Lock, contentDescription = "")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation()
        )
        Spacer(modifier = Modifier.height(10.dp))

        OutlinedTextField(
            value = confpassword,
            onValueChange ={ confpassword = it },
            label = { Text(text = "Confirm Password") },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            leadingIcon = { androidx.compose.material3.Icon(imageVector = Icons.Default.Lock, contentDescription = "")},
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation()
        )
        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = { navController .navigate(ROUT_INTENT) },
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .padding(start = 20.dp, end = 20.dp),
            colors = ButtonDefaults.buttonColors(Color.DarkGray)
        ){
            Text(text = "Create account")

        }
        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = { navController .navigate(ROUT_INTENT) },
            modifier = Modifier
                .fillMaxWidth()
                .height(50.dp)
                .padding(start = 20.dp, end = 20.dp),
            colors = ButtonDefaults.buttonColors(Color.DarkGray)
        ){
            Text(text = "Login")

        }







    }




}

@Composable
@Preview(showBackground = true)
fun SignupScreenPreview() {

    SignupScreen(rememberNavController())

}