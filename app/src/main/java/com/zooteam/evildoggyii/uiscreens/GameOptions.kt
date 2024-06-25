package com.zooteam.evildoggyii.uiscreens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.zooteam.evildoggyii.Game
import com.zooteam.evildoggyii.Routes

@Composable
fun GameOptions(navController: NavHostController, game: Game) {
   val minPlayers = 7f
   val maxPlayers = 16f
   val minWolf = 1f
   val maxWolf = 8f

   var playerSliderPosition by remember { mutableFloatStateOf(minPlayers)}
   var wolfSliderPosition by remember { mutableFloatStateOf(2f)}
   Column {
      // Player count slider and display
      Text(text = "Player Count: ${playerSliderPosition.toInt()}")
      Slider(value = playerSliderPosition,
         onValueChange = { playerSliderPosition = it },
         steps = ((maxPlayers - minPlayers) - 1).toInt(),
         valueRange = minPlayers..maxPlayers,
      )

      // Werewolf count slider and display
      Text(text = if(wolfSliderPosition<=2) {"Werewolf Count: ${wolfSliderPosition.toInt()}"} else {"Werewolf Count: ${wolfSliderPosition.toInt()}  (WARNING: THIS IS A HIGH NUMBER AND IS ALSO STUPID)"})
      Slider(value = wolfSliderPosition,
         onValueChange = { wolfSliderPosition = it },
         steps = ((maxWolf - minWolf).toInt() -1),
         valueRange = minWolf..maxWolf,
      )
      Button(onClick = { game.playerCount=playerSliderPosition.toInt(); game.fillList(); navController.navigate(
          Routes.NameEntry
      ) },
         modifier = Modifier
            .padding(50.dp)
            .width(300.dp)
            .height(100.dp)) {
         Text(text = "Click to Start!", fontSize = 30.sp )
      }
   }
}

