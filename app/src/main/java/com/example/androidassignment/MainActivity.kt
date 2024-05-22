package com.example.androidassignment

import Booking
import BookingConfirmation
import HelpScreen
import HomeScreen
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CalendarMonth
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Help
import androidx.compose.material.icons.filled.Login
import androidx.compose.material.icons.filled.Logout
import androidx.compose.material.icons.filled.Mail
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material.icons.outlined.ExpandCircleDown
import androidx.compose.material.icons.outlined.HelpOutline
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Mail
import androidx.compose.material.icons.outlined.ShoppingBag
import androidx.compose.material.icons.rounded.Help
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.ShoppingBag
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.androidassignment.ui.theme.AndroidAssignmentTheme
import com.example.androidassignment.ui.theme.Serc


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AndroidAssignmentTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BottomAppBar()

                }
            }
        }
    }
}

            @OptIn(ExperimentalMaterial3Api::class)
            @Composable
            fun BottomAppBar() {
                //val secondaryColor = Color.Gray
                val navigationController = rememberNavController()
                val context = LocalContext.current.applicationContext
                val selected = remember {
                    mutableStateOf(Icons.Rounded.Home)
                }
                val sheetState = rememberModalBottomSheetState()
                var showBottomSheet by remember {
                    mutableStateOf(false)
                }

                Scaffold(
                    bottomBar = {
                        androidx.compose.material3.BottomAppBar(
                            containerColor = Serc
                        ) {
                            Row( // Wrap in a Row for horizontal placement
                                modifier = Modifier.weight(1f) // Divide weight equally
                            ) {
                                Column( // Stack icon and text vertically
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .height(42.dp)
                                ) {
                                    CompositionLocalProvider(LocalContentColor provides Color.White) {
                                        IconButton(
                                            onClick = {
                                                selected.value = Icons.Rounded.Home
                                                navigationController.navigate(Screens.HomeScreen.screen) {
                                                    popUpTo(0)
                                                }
                                            }
                                        ) {
                                            Icon(
                                                imageVector = if (selected.value == Icons.Rounded.Home) {
                                                    Icons.Rounded.Home
                                                } else {
                                                    Icons.Outlined.Home // Change to the outline version when not selected
                                                },
                                                contentDescription = null,
                                                modifier = Modifier.size(24.dp)

                                            )
                                        }
                                        Text( // Add Text for the title
                                            text = "Home",
                                            fontSize = 12.sp,
                                            modifier = Modifier.padding(start = 1.dp)
                                            // Add padding for spacing
                                        )
                                    }
                                }
                            }
                            Spacer(modifier = Modifier.weight(1f))

                            Row( // Wrap in a Row for horizontal placement
                                modifier = Modifier.weight(1.5f) // Divide weight equally
                            ) {
                                Column( // Stack icon and text vertically
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .height(42.dp)
                                ) {
                                    CompositionLocalProvider(LocalContentColor provides Color.White) {
                                        IconButton(
                                            onClick = {
                                                selected.value = Icons.Rounded.ShoppingBag
                                                navigationController.navigate(Screens.ClothingScreen.screen) {
                                                    popUpTo(0)
                                                }
                                            }
                                        ) {
                                            Icon(
                                                imageVector = if (selected.value == Icons.Rounded.ShoppingBag) {
                                                    Icons.Rounded.ShoppingBag
                                                } else {
                                                    Icons.Outlined.ShoppingBag // Change to the outline version when not selected
                                                },
                                                contentDescription = null,
                                                modifier = Modifier.size(24.dp),
                                            )
                                        }
                                        Text( // Add Text for the title
                                            text = "Clothing",
                                            fontSize = 12.sp,
                                            modifier = Modifier.padding(start = 1.dp) // Add padding for spacing
                                        )
                                    }
                                }
                            }

                            Spacer(modifier = Modifier.weight(1f)) // Add Spacer between items
                            Row( // Wrap in a Row for horizontal placement
                                modifier = Modifier.weight(1f) // Divide weight equally
                            ) {
                                Column( // Stack icon and text vertically
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .height(42.dp)
                                ) {
                                    CompositionLocalProvider(LocalContentColor provides Color.White) {
                                        IconButton(
                                            onClick = {
                                                selected.value = Icons.Filled.Help
                                                navigationController.navigate(Screens.HelpScreen.screen) {
                                                    popUpTo(0)
                                                }
                                            }
                                        ) {
                                            Icon(
                                                imageVector = if (selected.value == Icons.Filled.Help) {
                                                    Icons.Rounded.Help
                                                } else {
                                                    Icons.Outlined.HelpOutline // Change to the outline version when not selected
                                                },
                                                contentDescription = null,
                                                modifier = Modifier.size(24.dp),
                                            )
                                        }
                                        Text( // Add Text for the title
                                            text = "Help",
                                            fontSize = 12.sp,
                                            modifier = Modifier.padding(start = 1.dp) // Add padding for spacing
                                        )
                                    }
                                }
                            }
// Close the Column for the second button
// Close the Row for horizontal placement

                            Spacer(modifier = Modifier.weight(1f)) // Add Spacer between items
                            Row( // Wrap in a Row for horizontal placement
                                modifier = Modifier.weight(1.5f) // Divide weight equally
                            ) {
                                Column( // Stack icon and text vertically
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    modifier = Modifier.fillMaxSize()
                                ) {
                                    CompositionLocalProvider(LocalContentColor provides Color.White) {
                                        IconButton(
                                            onClick = {
                                                selected.value = Icons.Default.Mail
                                                navigationController.navigate(Screens.ContactScreen.screen) {
                                                    popUpTo(0)
                                                }
                                            }
                                        ) {
                                            Icon(
                                                imageVector = if (selected.value == Icons.Filled.Mail) {
                                                    Icons.Filled.Mail
                                                } else {
                                                    Icons.Outlined.Mail // Change to the outline version when not selected
                                                },
                                                contentDescription = null,
                                                modifier = Modifier.size(24.dp),
                                            )
                                        }
                                        Text( // Add Text for the title
                                            text = "Contact",
                                            fontSize = 12.sp,
                                            modifier = Modifier.padding(start = 1.dp) // Add padding for spacing
                                        )
                                    }
                                }
                            }
                            Spacer(modifier = Modifier.weight(1f)) // Add Spacer between items

                            Row( // Wrap in a Row for horizontal placement
                                modifier = Modifier.weight(1.5f) // Divide weight equally
                            ) {
                                Column( // Stack icon and text vertically
                                    horizontalAlignment = Alignment.CenterHorizontally,
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .height(42.dp)
                                ) {
                                    CompositionLocalProvider(LocalContentColor provides Color.White) {
                                        IconButton(
                                            onClick = { showBottomSheet = true }) {
                                            Icon(
                                                Icons.Outlined.ExpandCircleDown,
                                                contentDescription = null,
                                                tint = Color.White
                                            )
                                        }
                                    }
                                    Text( // Add Text for the title
                                        text = "More",
                                        color = Color.White,
                                        fontSize = 12.sp,
                                        modifier = Modifier.padding(start = 1.dp) // Add padding for spacing
                                    )
                                }
                            }


                        }

                    }
                ){ paddingValues ->
                    NavHost(
                        navController = navigationController,
                        startDestination = Screens.HomeScreen.screen,
                        modifier = Modifier.padding(paddingValues)
                    ) {
                        composable(Screens.HomeScreen.screen) { HomeScreen() }
                        composable(Screens.ClothingScreen.screen) { ClothingScreen(navigationController) }
                        composable(Screens.HelpScreen.screen) { HelpScreen() }
                        composable(Screens.ContactScreen.screen) { ContactScreen()}
                        composable(Screens.BagScreen.screen) { Bag()}
                        composable(Screens.RegistrationScreen.screen) { Registration() }
                        composable(Screens.BookingScreen.screen) {Booking(navigationController) }
                        composable(Screens.BookingConfirmation.screen) { BookingConfirmation() }

                    }

                }
                if (showBottomSheet){
                    ModalBottomSheet(onDismissRequest = { showBottomSheet = false },
                        sheetState = sheetState
                    ) {
                        Column (modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.Transparent)
                            .padding(18.dp),
                            verticalArrangement = Arrangement.spacedBy(28.dp)
                        ){
                            BottomSheetItem(icon = Icons.Filled.CalendarMonth, title = "Booking" ) {
                                showBottomSheet = false
                                navigationController.navigate(Screens.BookingScreen.screen){
                                    popUpTo(0)
                                }
                            }
                            BottomSheetItem(icon = Icons.Default.Login, title = "Login") {
                                Toast.makeText(context, "Login", Toast.LENGTH_SHORT).show()
                            }
                            BottomSheetItem(icon = Icons.Default.Logout, title = "Logout") {
                                Toast.makeText(context, "Logout", Toast.LENGTH_SHORT).show()
                            }
                            BottomSheetItem(icon = Icons.Default.Edit, title = "Register") {
                                Toast.makeText(context, "Register", Toast.LENGTH_SHORT).show()
                            }
                        }
                    }
                }
            }
@Composable
fun BottomSheetItem(icon: ImageVector, title: String, onClick: () -> Unit){
    Row(verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(12.dp),
        modifier = Modifier.clickable { onClick() }
    ) {
        Icon(icon, contentDescription = null, tint = Serc )
        Text(text = title, color = Color.Black, fontSize = 22.sp)
    }

}





@Preview
@Composable
fun BottomAppBarPreview() {
    AndroidAssignmentTheme {

        BottomAppBar()


    }
}








