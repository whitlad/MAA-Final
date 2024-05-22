import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidassignment.R
import com.example.androidassignment.Screens
import com.example.androidassignment.ui.theme.AndroidAssignmentTheme
import com.example.androidassignment.ui.theme.Offwhite
import com.example.androidassignment.ui.theme.Serc

@Composable
fun HomeScreen() {
    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Offwhite)//CHANGE BACKGROUND COLOUR
                .align(Alignment.Center),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Welcome", fontSize = 30.sp)


            Image(
                painter = painterResource(id = R.drawable.blacklogo),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(500.dp, 700.dp)

            )


        }
    }
}
@Preview
@Composable
fun HomeScreenScreenPreview() {
    AndroidAssignmentTheme {
        HomeScreen()
    }
}

