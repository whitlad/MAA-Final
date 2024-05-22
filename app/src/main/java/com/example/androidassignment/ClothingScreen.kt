package com.example.androidassignment

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
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.androidassignment.ui.theme.Offwhite
val SERCPINK = Color(0xFFEA168b) // Example: SERC Color
val Offwhite = Color(0xFFFAFAFA) // Example Offwhite color

@Composable
fun ClothingScreen(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Offwhite)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            SampleImageSlider()

            Text(text = "Clothing", fontSize = 24.sp, color = Color.Black)
        }

        Button(
            onClick = { navController.navigate (Screens.BagScreen.screen) },
            colors = ButtonDefaults.buttonColors(SERCPINK),
            modifier = Modifier
                .align(Alignment.BottomCenter)
                .padding(16.dp)
        ) {
            Text(text = "Add to Basket")
        }
    }
    Spacer(modifier = Modifier.height(32.dp)) // Increase the height of the Spacer
}


@Composable
fun ImageSlider(imageList: List<Int>, modifier: Modifier = Modifier) {
    LazyRow(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        items(imageList) { imageResId ->
            Image(
                painter = painterResource(id = imageResId),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(450.dp, 600.dp)
                    .padding(vertical = 10.dp)
                    .fillMaxWidth(0.5f)
            )
        }
    }

}
@Composable
fun SampleImageSlider() {
    val imageList = listOf(
        R.drawable.selectionofsuits,
        R.drawable.selectionofshirts,
        R.drawable.f_suit_blue,
        R.drawable.f_suit_beige,
        R.drawable.f_suit_grey,
        R.drawable.f_suit_white,
        R.drawable.f_suit_red,
        R.drawable.suit_grey,
        R.drawable.suit_navy,
        R.drawable.suit_brown,
        R.drawable.suit_navy_twill,
        R.drawable.suit_green,

        // Add more images here as needed
    )
    ImageSlider(imageList = imageList)
}

@Preview
@Composable
fun ClothingPreview() {
    val navController = rememberNavController()
    ClothingScreen(navController = navController)

}
