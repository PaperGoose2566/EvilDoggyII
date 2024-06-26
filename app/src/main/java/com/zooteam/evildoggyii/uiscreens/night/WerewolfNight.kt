package com.zooteam.evildoggyii.uiscreens.night

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.zooteam.evildoggyii.Game
import com.zooteam.evildoggyii.Routes
import com.zooteam.evildoggyii.roles.Werewolf

@Composable
fun WerewolfNight(navController: NavHostController, game: Game) {
    var selectedPlayer by remember {
        mutableIntStateOf(-1)
    }
    Column {
        for (i in 0..game.playerList.size-1) {
            if(game.playerList[i].role !is Werewolf) {
                Button(
                    onClick = {selectedPlayer = i},
                    modifier = Modifier
                        .width(180.dp)
                        .height(80.dp)
                        .padding(12.dp))
                {
                    Text(text = game.playerList[i].name)
                }
            }
        }
        Text(text = if(selectedPlayer == -1) "" else "Selected: ${game.playerList[selectedPlayer].name}")
        Button(onClick = {game.count++; game.playerList[selectedPlayer].voteCount++; navController.navigate(Routes.Trans)}) {
            Text(text = "Confirm Vote")
        }
    }
}