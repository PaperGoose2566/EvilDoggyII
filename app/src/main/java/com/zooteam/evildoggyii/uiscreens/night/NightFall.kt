package com.zooteam.evildoggyii.uiscreens.night

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.zooteam.evildoggyii.Game
import com.zooteam.evildoggyii.Routes
import com.zooteam.evildoggyii.roles.Seher
import com.zooteam.evildoggyii.roles.Werewolf

@Composable
fun NightFall(navController: NavHostController, game: Game) {
    game.nightInit()
    Column {
       Text(text = "Night Has Fallen")
       Text(text = "Please Pass The Device To ${game.playerList[0].name}")
       Button(onClick = {
           when(game.playerList[0].role) {
               is Werewolf -> navController.navigate(Routes.Werewolf)
               is Seher -> navController.navigate(Routes.Seer)
               else -> {game.count++; navController.navigate(Routes.Villager)}
           }
       }) {
       }
    }
}