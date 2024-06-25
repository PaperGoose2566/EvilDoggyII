package com.zooteam.evildoggyii

import androidx.activity.compose.BackHandler
import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.zooteam.evildoggyii.uiscreens.GameOptions
import com.zooteam.evildoggyii.uiscreens.MainMenu
import com.zooteam.evildoggyii.uiscreens.night.NightFall
import com.zooteam.evildoggyii.uiscreens.night.SeerNight
import com.zooteam.evildoggyii.uiscreens.night.SeerReveal
import com.zooteam.evildoggyii.uiscreens.night.Transition
import com.zooteam.evildoggyii.uiscreens.night.WerewolfNight
import com.zooteam.evildoggyii.uiscreens.roleassign.NameEntry
import com.zooteam.evildoggyii.uiscreens.roleassign.RoleAssignmentScreen

@Composable
fun TheNavigator(game : Game) {
// Navigation Controller
    val navController = rememberNavController()
    // Navigation Graph defines the possible routes
    NavHost(navController = navController, startDestination = Routes.MainMenu, enterTransition = {
        // you can change whatever you want transition
        EnterTransition.None
        },
        exitTransition = {
            // you can change whatever you want transition
            ExitTransition.None
        }) {
        // First route is defined with its name stored in Routes
        composable(Routes.MainMenu) {
            MainMenu(navController)
        }
        composable(Routes.GameOptions) {
            GameOptions(navController, game = game)
        }
        composable(Routes.NameEntry) {
            NameEntry(navController, game)
            BackHandler(true) {
                // blocks the back button from breaking everything
            }
        }
        composable(Routes.RoleAssignment+"/{name}") {
            val name = it.arguments?.getString("name")
            RoleAssignmentScreen(navController, game, name!!)
            BackHandler(true) {
                // blocks the back button from breaking everything
            }
        }
        composable(Routes.NightFall) {
            NightFall(navController = navController, game = game)
        }
        composable(Routes.Werewolf) {
            WerewolfNight(navController, game)
        }
        composable(Routes.Trans) {
            Transition(navController = navController, game = game)
        }
        composable(Routes.Seer) {
            SeerNight(navController, game)
        }
        composable(Routes.SeerReveal) {
            SeerReveal(navController, game)
        }
    }
}