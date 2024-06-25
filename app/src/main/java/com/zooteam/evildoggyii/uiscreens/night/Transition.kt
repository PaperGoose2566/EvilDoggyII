package com.zooteam.evildoggyii.uiscreens.night

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.zooteam.evildoggyii.Game
import com.zooteam.evildoggyii.Routes
import com.zooteam.evildoggyii.roles.Seher
import com.zooteam.evildoggyii.roles.Werewolf

@Composable
fun Transition(navController: NavHostController, game: Game) {
    Text(text = "Please Pass The Device To ${game.playerList[game.count]}")
    Button(onClick = {
        when(game.playerList[game.count].role) {
            is Werewolf -> navController.navigate(Routes.Werewolf)
            is Seher -> navController.navigate(Routes.Seer)
            else -> navController.navigate(Routes.Trans)
        }
        game.count++
    }) {

    }
}