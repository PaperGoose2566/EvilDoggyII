package com.zooteam.evildoggyii.uiscreens.night

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.zooteam.evildoggyii.Game
import com.zooteam.evildoggyii.Routes
import com.zooteam.evildoggyii.roles.Seher
import com.zooteam.evildoggyii.roles.Werewolf

@Composable
fun Transition(navController: NavHostController, game: Game) {
    if(game.count<=game.playerList.size-1) {
        if(!game.playerList[game.count].isDead ) {
            Column {
                Text(text = "Please Pass The Device To ${game.playerList[game.count].name}")
                Button(onClick = {
                    when (game.playerList[game.count].role) {
                        is Werewolf -> navController.navigate(Routes.Werewolf)
                        is Seher -> navController.navigate(Routes.Seer)
                        else -> {
                            game.count++; navController.navigate(Routes.Villager)
                        }
                    }
                }, modifier = Modifier.width(70.dp).height(25.dp)) {

                }
            }
        } else navController.navigate(Routes.Dead)
    } else {
        game.nightInit()
        // TODO: Logic to kill players based on werewolf votes
        // ALSO TODO: Daytime
        navController.navigate(Routes.NightFall)
    }
}