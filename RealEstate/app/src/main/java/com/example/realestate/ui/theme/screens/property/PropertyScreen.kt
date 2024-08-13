@file:Suppress("PreviewMustBeTopLevelFunction")

package com.example.realestate.ui.theme.screens.property

import android.annotation.SuppressLint
import android.content.Intent
import android.provider.MediaStore
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.outlined.Face
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.realestate.R
import com.example.realestate.ui.theme.purple70
import com.example.realestate.ui.theme.screens.intent.BottomNavItem
import com.example.realestate.ui.theme.screens.intent.IntentScreen
import com.example.realestate.ui.theme.screens.intent.bottomNavItems

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun PropertyScreen(navController: NavController) {
    Column(modifier = Modifier.fillMaxSize()) {

        var selected by remember { mutableIntStateOf(0) }
        Scaffold(
            bottomBar = {
                NavigationBar {

                    bottomNavItems.forEachIndexed { index, bottomNavItem ->
                        NavigationBarItem(
                            selected = index == selected,
                            onClick = {
                                selected = index
                                navController.navigate(bottomNavItem.route)
                            },
                            icon = {
                                BadgedBox(
                                    badge = {
                                        if (bottomNavItem.badges != 0) {
                                            Badge {
                                                Text(text = bottomNavItem.badges.toString())
                                            }
                                        } else if (bottomNavItem.hasNews) {
                                            Badge()
                                        }
                                    }
                                ) {
                                    androidx.compose.material3.Icon(
                                        imageVector =
                                        if (index == selected)
                                            bottomNavItem.selectedIcon
                                        else
                                            bottomNavItem.unselectedIcon,
                                        contentDescription = bottomNavItem.title
                                    )
                                }

                            },
                            label = {
                                Text(text = bottomNavItem.title)
                            })
                    }
                }
                TopAppBar(
                    title = {
                        Text(
                            text = "Magic Bricks"
                        ) /*TODO*/
                    })


            },


            floatingActionButton = {
                FloatingActionButton(onClick = { /*TODO*/ }) {
                    IconButton(onClick = { /*TODO*/ }) {
                        androidx.compose.material3.Icon(
                            imageVector = Icons.Default.Add,
                            contentDescription = "menu"
                        )
                    }
                }
            },
            //Content Section
            content = @Composable {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(top = 80.dp)
                ) {
                    Row {
                        Card(
                            modifier = Modifier
                                .height(180.dp)
                                .width(200.dp)
                        ) {
                            Box(
                                modifier = Modifier.fillMaxSize(),
                                contentAlignment = Alignment.Center
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.home2),
                                    contentDescription = "home",
                                    modifier = Modifier.fillMaxSize(),
                                    contentScale = ContentScale.Crop

                                )

                                androidx.compose.material3.Icon(
                                    imageVector = Icons.Default.Favorite,
                                    contentDescription = "favourite",
                                    modifier = Modifier
                                        .align(Alignment.TopStart)
                                        .padding(10.dp),
                                    tint = Color.Magenta
                                )
                            }
                        }
                        Column(modifier = Modifier.padding(start = 20.dp)) {
                            Text(text = "Visit Lavington", fontSize = 20.sp)
                            Text(text = "The best property you can find")
                            Row {
                                androidx.compose.material3.Icon(
                                    imageVector = Icons.Default.Star,
                                    contentDescription = "star",
                                    tint = Color.Gray,
                                    modifier = Modifier.size(30.dp)
                                )
                                androidx.compose.material3.Icon(
                                    imageVector = Icons.Default.Star,
                                    contentDescription = "star",
                                    tint = Color.Gray,
                                    modifier = Modifier.size(30.dp)
                                )
                                androidx.compose.material3.Icon(
                                    imageVector = Icons.Default.Star,
                                    contentDescription = "star",
                                    tint = Color.Gray,
                                    modifier = Modifier.size(30.dp)
                                )
                                androidx.compose.material3.Icon(
                                    imageVector = Icons.Default.Star,
                                    contentDescription = "star",
                                    tint = Color.Gray,
                                    modifier = Modifier.size(30.dp)
                                )
                                androidx.compose.material3.Icon(
                                    imageVector = Icons.Default.Star,
                                    contentDescription = "star",
                                    tint = Color.Gray,
                                    modifier = Modifier.size(30.dp)
                                )
                            }
                            Text(text = "54,780 Reviews")
                            Button(
                                onClick = { /*TODO*/ },
                                colors = ButtonDefaults.buttonColors(purple70),
                                shape = RoundedCornerShape(10.dp)


                            ) {
                                Text(text = "Call")
                            }

                        }


                    }
                    //End 0f row
                    //STK
                    val mContext = LocalContext.current
                    OutlinedButton(
                        onClick = {
                            val simToolKitLaunchIntent =
                                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                            simToolKitLaunchIntent?.let {
                                mContext.startActivity(it)
                            }

                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 20.dp, end = 20.dp)
                            .height(50.dp),
                        colors = ButtonDefaults.buttonColors(Color.Black),
                        shape = RoundedCornerShape(10.dp)
                    ) {
                        Text(text = "STK")
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    //EMAIL
                    Button(
                        onClick = {
                            val shareIntent = Intent(Intent.ACTION_SEND)
                            shareIntent.type = "text/plain"
                            shareIntent.putExtra(
                                Intent.EXTRA_EMAIL,
                                arrayOf("vicmmaina@gmail.com")
                            )
                            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "subject")
                            shareIntent.putExtra(
                                Intent.EXTRA_TEXT,
                                "Hello, this is the email body"
                            )
                            mContext.startActivity(shareIntent)
                        },
                        modifier = Modifier
                            .size(width = 380.dp, height = 70.dp)
                            .fillMaxWidth()
                            .padding(start = 20.dp, end = 20.dp, top = 20.dp),
                        shape = CutCornerShape(5.dp),
                        colors = ButtonDefaults.buttonColors(Color.Black)
                    ) {
                        Text(text = "EMAIL")
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    //SHARE
                    Button(
                        onClick = {
                            val shareIntent = Intent(Intent.ACTION_SEND)
                            shareIntent.type = "text/plain"
                            shareIntent.putExtra(
                                Intent.EXTRA_TEXT,
                                "Check out this is a cool content"
                            )
                            mContext.startActivity(Intent.createChooser(shareIntent, "Share"))
                        },
                        modifier = Modifier
                            .size(width = 380.dp, height = 70.dp)
                            .fillMaxWidth()
                            .padding(start = 20.dp, end = 20.dp, top = 20.dp),
                        shape = CutCornerShape(5.dp),
                        colors = ButtonDefaults.buttonColors(Color.Black)
                    ) {
                        Text(text = "SHARE")
                    }

                    Spacer(modifier = Modifier.height(20.dp))


                    //CALL
                    Button(
                        onClick = {
                            val callIntent = Intent(Intent.ACTION_DIAL)
                            callIntent.data = "tel:0716363753".toUri()
                            mContext.startActivity(callIntent)
                        },
                        modifier = Modifier
                            .size(width = 380.dp, height = 70.dp)
                            .fillMaxWidth()
                            .padding(start = 20.dp, end = 20.dp, top = 20.dp),
                        shape = CutCornerShape(5.dp),
                        colors = ButtonDefaults.buttonColors(Color.Black)
                    ) {
                        Text(text = "CALL")
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    //SMS
                    Button(
                        onClick = {
                            val smsIntent = Intent(Intent.ACTION_SENDTO)
                            smsIntent.data = "smsto:0716363753".toUri()
                            smsIntent.putExtra("sms_body", "Hello Victor,how was your day?")
                            mContext.startActivity(smsIntent)
                        },
                        modifier = Modifier
                            .size(width = 380.dp, height = 70.dp)
                            .fillMaxWidth()
                            .padding(start = 20.dp, end = 20.dp, top = 20.dp),
                        shape = CutCornerShape(5.dp),
                        colors = ButtonDefaults.buttonColors(Color.Black)
                    ) {
                        Text(text = "SMS")
                    }
                    Spacer(modifier = Modifier.height(20.dp))

                    //CAMERA
                    Button(
                        onClick = {
                            val cameraIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
                            if (cameraIntent.resolveActivity(mContext.packageManager) != null) {
                                mContext.startActivity(cameraIntent)
                            } else {
                                println("Camera app is not available")
                            }
                        },
                        modifier = Modifier
                            .size(width = 380.dp, height = 70.dp)
                            .fillMaxWidth()
                            .padding(start = 20.dp, end = 20.dp, top = 20.dp),
                        shape = CutCornerShape(5.dp),
                        colors = ButtonDefaults.buttonColors(Color.Black)
                    ) {
                        Text(text = "CAMERA")
                    }

                }
            }


        )


    }
}

    val bottomNavItems = listOf(
        BottomNavItem(
            title = "Homepage",
            route = "home",
            selectedIcon = Icons.Filled.Home,
            unselectedIcon = Icons.Outlined.Home,
            hasNews = false,
            badges = 0
        ),




        BottomNavItem(
            title = "Login",
            route = "login",
            selectedIcon = Icons.Filled.Person,
            unselectedIcon = Icons.Outlined.Person,
            hasNews = true,
            badges = 5
        ),


        BottomNavItem(
            title = "Signup",
            route = "signup",
            selectedIcon = Icons.Filled.Face,
            unselectedIcon = Icons.Outlined.Face,
            hasNews = true,
            badges = 1
        ),
    )

    data class BottomNavItem(
        val title: String,
        val route: String,
        val selectedIcon: ImageVector,
        val unselectedIcon: ImageVector,
        val hasNews: Boolean,
        val badges: Int
    )

@Composable
@Preview(showBackground = true)
fun PropertyScreenPreview(){
    PropertyScreen(rememberNavController())
}
