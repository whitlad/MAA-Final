package com.example.androidassignment

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import com.example.androidassignment.ui.theme.AndroidAssignmentTheme
import com.example.androidassignment.ui.theme.Midgrey
import com.example.androidassignment.ui.theme.Offwhite
import com.example.androidassignment.ui.theme.Serc

@Composable
fun ContactScreen() {
    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)//add space below text
                .background(color = Offwhite),

            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally,

            ) {
            Text(text = "Contact Us", fontSize = 35.sp)

            Image(
                painter = painterResource(id = R.drawable.serclogo),
                contentDescription = "SERC Logo Pink",
                modifier = Modifier
                    .size(200.dp, 100.dp)
            )
            Text(text = "Suited and Booted", fontSize = 24.sp)
            Text(text = "Castle Park Road", fontSize = 24.sp)
            Text(text = "Bangor BT20 4TD", fontSize = 24.sp)
            Image(
                painter = painterResource(id = R.drawable.telephone),
                contentDescription = "Image of a Telephone",
                modifier = Modifier
                    .fillMaxWidth()
                    .size(100.dp, 100.dp)
                    .padding(horizontal = 10.dp, vertical = 24.dp)
            )
            Text(text = "Tel: 0345 6007555", fontSize = 24.sp)
            Image(
                painter = painterResource(id = R.drawable.streetmap),
                contentDescription = "Street Map of SERC",
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .size(450.dp, 450.dp)
                                    )
            Text(text = "Map", fontSize = 30.sp)


        }


    }

}
@Preview
@Composable
fun ContactScreenPreview() {
    AndroidAssignmentTheme {
        ContactScreen()
    }
}
