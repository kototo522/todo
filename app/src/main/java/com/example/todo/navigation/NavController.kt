package com.example.todo.navigation

import androidx.navigation.NavController
import com.example.home.navigation.HomeNavigation

fun NavController.home(): HomeNavigation {
    return HomeNavigation(this)
}
