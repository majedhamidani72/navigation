package com.tadrisabtedai.navigation.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import com.tadrisabtedai.navigation.navigation.Screen

@Composable
fun LoginScreen(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    )
    {
        Text(text = "لاگین")


        var username by remember { mutableStateOf("") }

        Column {
            TextField(
                value = username,
                onValueChange = { username = it },
                label = { Text("نام کاربری") }
            )

            Button(onClick = {
                //مقدار دهی واقعی برای ارسال داده
                navController.navigate(Screen.Home.paramsWithArgs(username,"20")) {
                    popUpTo(Screen.Login.route) {
                        inclusive = true
                    }
                }
            }) {
                Text("ورود به خانه")
            }
        }
    }

}