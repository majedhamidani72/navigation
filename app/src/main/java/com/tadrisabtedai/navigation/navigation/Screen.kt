package com.tadrisabtedai.navigation.navigation

sealed class Screen(val route: String) {
    object Profile : Screen("profile")
    object Home : Screen("home")
    object Login : Screen("login")

    //فان برای قالب داده ها جهت دریافت آنها در صفحه هوم
    fun routeWithArgs(vararg args: String): String {
        return buildString {
            append(route)
            args.forEachIndexed() { index, _ ->
                append("?$index={$index}")
            }
        }
    }
    //فان برای مقدار دهی واقعی جهت استفاده در صفحه لاگین برای فرستادن داده های واقعی
    fun paramsWithArgs(vararg args: String): String {
        return buildString {
            append(route)
            args.forEachIndexed() { index, value ->
                append("?$index=$value")
            }
        }
    }

}