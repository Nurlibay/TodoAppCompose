package uz.nurlibaydev.todoappcompose.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import uz.nurlibaydev.todoappcompose.navigation.destinations.listComposable
import uz.nurlibaydev.todoappcompose.navigation.destinations.taskComposable
import uz.nurlibaydev.todoappcompose.util.Constants.LIST_SCREEN

/**
 *  Created by Nurlibay Koshkinbaev on 04/02/2023 16:03
 */

@Composable
fun SetupNavigation(
    navController: NavHostController,
) {
    val screen = remember(navController) {
        Screens(navController = navController)
    }

    NavHost(
        navController = navController, startDestination = LIST_SCREEN
    ) {
        listComposable(
            navigateToTaskScreen = screen.task
        )
        taskComposable(
            navigateToListScreen = screen.list
        )
    }
}