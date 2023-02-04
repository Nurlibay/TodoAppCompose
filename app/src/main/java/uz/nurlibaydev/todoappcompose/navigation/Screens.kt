package uz.nurlibaydev.todoappcompose.navigation

import androidx.navigation.NavHostController
import uz.nurlibaydev.todoappcompose.util.Action
import uz.nurlibaydev.todoappcompose.util.Constants.LIST_SCREEN

/**
 *  Created by Nurlibay Koshkinbaev on 04/02/2023 15:49
 */

class Screens(navController: NavHostController) {
    val list: (Action) -> Unit = { action ->
        navController.navigate("list/$action") {
            popUpTo(LIST_SCREEN) { inclusive = true }
        }
    }
    val task: (Int) -> Unit = { taskId ->
        navController.navigate("task/$taskId")
    }
}