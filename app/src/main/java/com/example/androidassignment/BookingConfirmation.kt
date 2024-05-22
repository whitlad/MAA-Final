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
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidassignment.R
import com.example.androidassignment.Screens
import com.example.androidassignment.ui.theme.Offwhite

@Composable
fun BookingConfirmation(){
    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .align(Alignment.Center)
                .background(color = Offwhite),


            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally)
        {
            Spacer(modifier = Modifier.height(32.dp))
            Text(text = "Booking Confirmed", fontSize = 24.sp, color = Color.Black)

            Spacer(modifier = Modifier.height(32.dp))

            Image(
                painter = painterResource(id = R.drawable.bookingconfirmation),
                contentDescription = null, // content description
                modifier = Modifier.size(400.dp)

            )

            Text(text = "Your Booking is Confirmed", fontSize = 24.sp, color = Color.Black)
            Spacer(modifier = Modifier.height(15.dp))
            Text(text = "27th May 2024 @ 11am SERC Bangor", fontSize = 24.sp, color = Color.Black,modifier = Modifier.padding(horizontal = 24.dp, vertical = 24.dp))
        }
    }
}
@Preview
@Composable
fun BookingConfirmationScreen() {
    BookingConfirmation()
}