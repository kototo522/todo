package com.example.home.navigation

import androidx.navigation.NavController

class HomeNavigation(private val navController: NavController) {
    fun navigateToSetting() {
        navController.navigate(HOME_ROUTE) {
            launchSingleTop = true
            restoreState = true
        }
    }

    fun popBackStack() {
        navController.popBackStack()
    }
}