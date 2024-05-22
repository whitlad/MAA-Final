import android.os.Build.VERSION_CODES.R
import com.example.androidassignment.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.androidassignment.Screens
val SERCPINK = Color(0xFFEA168b) // Example: SERC Color
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Booking(navController: NavController) {  //has this one line of code fixed the problem?

    var selectedDate by remember { mutableStateOf("") }
    var selectedTime by remember { mutableStateOf("") }
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text( "Book an Appointment", textAlign = TextAlign.Center, fontSize = 30.sp ) }
            )
        },
        content = { contentPadding ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 16.dp, vertical = contentPadding.calculateBottomPadding()),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                // Date and time selection
                Spacer(modifier = Modifier.height(60.dp))
                
                OutlinedTextField(
                    value = selectedDate,
                    onValueChange = { selectedDate = it },
                    label = { Text("Select a Date") },  //not connected to a calendar not active
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth()
                )
                // Time selection
                OutlinedTextField(
                    value = selectedTime,
                    onValueChange = { selectedTime = it },
                    label = { Text("Select a Time") }, //not connected to a calendar not active
                    singleLine = true,
                    modifier = Modifier.fillMaxWidth()
                )
                // Image and Text Row
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    // Image
                    Image(
                        painter = painterResource(id = com.example.androidassignment.R.drawable.calendar),
                        contentDescription = null, // content description
                        modifier = Modifier.size(400.dp)
                    )
                    // Text
                    Text(
                        text = "HEY MY TEXT",
                        modifier = Modifier.padding(start = 8.dp)
                    )
                }
                // Booking Button
                Button(
                    onClick = { navController.navigate (Screens.BookingConfirmation.screen)
                    }, //this isn't working
                    modifier = Modifier.fillMaxWidth(),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = SERCPINK, //not sure how to add the SERC Color here as a button color
                        contentColor = Color.White )

                ) {
                    Text("Book an Appointment")
                }
            }
        }
    )
}
@Preview
@Composable
fun PreviewBooking() {
    val navController = rememberNavController()
    Booking(navController = navController)
}

