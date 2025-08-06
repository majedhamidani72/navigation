package com.tadrisabtedai.navigation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.tadrisabtedai.navigation.ui.screens.HomeScreen
import com.tadrisabtedai.navigation.ui.screens.LoginScreen
import com.tadrisabtedai.navigation.ui.screens.ProfileScreen

@Composable
fun SetNavHost(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.Login.route
    ) {
        composable(
            route = Screen.Home.routeWithArgs("0:username", "1:id"),
            arguments = listOf(
                navArgument("0") {
                    type = NavType.StringType
                    defaultValue=""
                },
                navArgument("1") {
                    type = NavType.StringType
                    defaultValue=""
                }
            )
        ) {
            val username = it.arguments?.getString("0")
            val id = it.arguments?.getString("1")
            HomeScreen(navController, username,id)
        }

        composable(route = Screen.Profile.route) {
            ProfileScreen(navController)
        }

        composable(route = Screen.Login.route) {
            LoginScreen(navController)
        }
    }
}
