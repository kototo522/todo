package com.example.home.navigation

import androidx.navigation.compose.composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.navigation
import com.example.home.HomeScreen

const val HOME_ROUTE = "home"
const val HOME_GRAPH_ROUTE = "home_graph"

fun NavGraphBuilder.homeNavGraph(
    homeController: HomeNavigation,
    route: String = HOME_GRAPH_ROUTE
) {
    val popBackStack: () -> Unit = { homeController.popBackStack() }

    navigation(
        startDestination = HOME_ROUTE,
        route = route
    ) {
        composable(HOME_ROUTE) {
            HomeScreen()
        }
    }
}
