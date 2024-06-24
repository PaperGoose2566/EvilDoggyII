package com.zooteam.evildoggyii

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

@Composable
fun GameOptions(navController: NavHostController, game: Game) {
   var sliderPosition by remember { mutableFloatStateOf(7f)}
   Column {
      Slider(value = sliderPosition,
         onValueChange = { sliderPosition = it },
         steps = 2,
         valueRange = 7f..10f,
      )
      Text(text = "${sliderPosition.toInt()}")
      Button(onClick = { game.setPlayerCount(sliderPosition.toInt()); game.fillList(); navController.navigate(Routes.RoleAssignment) },
         modifier = Modifier.padding(50.dp).width(300.dp).height(100.dp)) {
         Text(text = "Click to Start!", fontSize = 30.sp )
      }
   }
}

