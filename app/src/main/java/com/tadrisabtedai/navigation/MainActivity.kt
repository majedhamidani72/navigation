package com.tadrisabtedai.navigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.tadrisabtedai.navigation.navigation.SetNavHost
import com.tadrisabtedai.navigation.ui.theme.NavigationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NavigationTheme {
                    AppNavigaion()

            }
        }
    }
}
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun AppNavigaion() {
    val navController = rememberNavController()
    SetNavHost(navController)

}

