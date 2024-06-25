package com.zooteam.evildoggyii.uiscreens.night

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.zooteam.evildoggyii.CardTable
import com.zooteam.evildoggyii.Game
import com.zooteam.evildoggyii.Routes
import com.zooteam.evildoggyii.Semantics
import com.zooteam.evildoggyii.roles.Seher

@Composable
fun SeerReveal(navController: NavHostController, game: Game) {
   var sol = game.dumb
   Column {
      Text(text =
      if(Semantics.vowlCheck(game.playerList[sol].name) == 1)
      {"${game.playerList[sol].name} was an ${game.playerList[sol].role.name}"}
      else
      {"${game.playerList[sol].name} was a ${game.playerList[sol].role.name}"}
      )
      Image(painter = CardTable.getCard(idx = game.gameRoles[sol].cardidx),
         contentDescription = game.gameRoles[sol].name,
         modifier = Modifier
            .size(500.dp))
      Button(onClick = {navController.navigate(Routes.Trans); var seher = game.playerList[game.count].role as Seher; seher.usedAbility = true}, modifier = Modifier
         .width(50.dp)
         .height(20.dp)) {

      }
   }
}