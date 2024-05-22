package com.example.androidassignment



sealed class Screens (val screen: String) {
    data object HomeScreen: Screens("home")
    data object ClothingScreen: Screens("clothing")
    data object HelpScreen: Screens("help")
    data object ContactScreen: Screens("contact")
    data object BagScreen: Screens("bag")
    data object LoginScreen: Screens("Login")//not required for this project no db access
    data object LogoutScreen: Screens("Logout")//not required for this project no db access
    data object RegistrationScreen: Screens("Registration")
    data object BookingScreen: Screens("Booking")
    data object BookingConfirmation: Screens("BookingConfirmation")
    data object SuitScreen: Screens("Suits and Dresses")

}


