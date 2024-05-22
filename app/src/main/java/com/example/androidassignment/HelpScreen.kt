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
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androidassignment.ContactScreen
import com.example.androidassignment.R
import com.example.androidassignment.ui.theme.AndroidAssignmentTheme
import com.example.androidassignment.ui.theme.Offwhite
import com.example.androidassignment.ui.theme.Serc

@Composable
fun HelpScreen() {

       Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = Offwhite)//CHANGE BACKGROUND COLOUR
                .align(Alignment.Center),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.serclogo),
                contentDescription = "SERC Logo Pink",
                contentScale = ContentScale.FillWidth,
                modifier = Modifier
                    .size(200.dp, 100.dp)
                    .padding(16.dp)
            )

            Text(text = "Help", fontSize = 30.sp)
            Text(text = "Need Help? We're here for you! \n" +
                    "Need an outfit for interview? Check out the Zero Shop first before you buy one, you will also be helping make a difference by reducing textile waste.\n" +
                    "Help put an end to fast fashion. A sustainable economy requires fast fashion’s model of take, make and waste to be overturned. There is a desperate need to limit the sheer volume of textile waste that fast fashion creates. SERC will be taking a stand by offering students the opportunity to pick up an outfit, for university or job interviews, free of charge from their local campus.\n" +
                    "Donations can be dropped off at the following areas:\n" +
                    "Newtownards: C1, contact lbuick@serc.ac.uk\n" +
                    "Bangor: D23, contact lbuick@serc.ac.uk\n" +
                    "Lisburn: SU office, contact cshipman@serc.ac.uk            \n" +
                    "Downpatrick: Sports Department, contact amcloughlin@serc.ac.uk  "

                , modifier = Modifier.padding(horizontal = 16.dp, vertical = 30.dp) // Apply 16.dp padding to horizontal and 8.dp to vertical
            )


        }
    }
}
@Preview
@Composable
fun HelpScreenPreview() {
    AndroidAssignmentTheme {
        HelpScreen()
    }
}

