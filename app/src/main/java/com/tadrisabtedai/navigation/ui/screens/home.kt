package com.tadrisabtedai.navigation.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.tadrisabtedai.navigation.navigation.Screen


@Composable
fun HomeScreen(navHostController: NavHostController, username: String?,id:String?) {
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
        )
    {
        Text(text = "خانه")
        Spacer(Modifier.height(height = 20.dp))
        Text(text = "سلام $username")

        Button(
            onClick = {
                navHostController.navigate(Screen.Profile.route)
//                {
//                    popUpTo(Screen.Home.route){ //یعنی بعد از رفتن به پروفایل دیگر خانه در مسیر برگشت نیست.
//                        inclusive = true
//                    }
//                }
            })
        { Text("برو به پروفایل") }
        Text("آی‌دی شما: $id")


    }

}