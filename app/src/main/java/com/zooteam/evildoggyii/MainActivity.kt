package com.zooteam.evildoggyii

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.zooteam.evildoggyii.ui.theme.EvilDoggyIITheme

class MainActivity : ComponentActivity() {
    var game = Game()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EvilDoggyIITheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // Navigation Controller
                    val navController = rememberNavController()
                    // Navigation Graph defines the possible routes
                    NavHost(navController = navController, startDestination = Routes.MainMenu) {
                        // First route is defined with its name stored in Routes
                        composable(Routes.MainMenu) {
                           MainMenu(navController)
                        }
                        composable(Routes.RoleAssignment) {
                            RoleAssignmentScreen(navController, game)
                        }
                    }
                }
            }
        }
    }
}