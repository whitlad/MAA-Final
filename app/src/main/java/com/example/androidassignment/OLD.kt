package com.example.androidassignment

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidassignment.ui.theme.Sandbgrey

@Composable
fun OLD() {
    @Composable
    fun ContactScreen() {
        Box(modifier = Modifier.fillMaxSize()) {
            Column (modifier = Modifier
                .fillMaxSize()
                .background(color = Sandbgrey)//CHANGE BACKGROUND COLOUR
                .align(Alignment.Center),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally) {
                Text(text = "Home XXXXXX", fontSize = 30.sp, color = Color.Red)
                Text(text = "Welcome to the Home Screen!", fontSize= 30.sp, color = Color.Blue)

                Image(
                    painter = painterResource(id = R.drawable.logobag1),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(300.dp, 400.dp)
                        .padding(vertical =8.dp)
                )
                
            }
        }
    }
}





