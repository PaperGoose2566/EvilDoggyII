package com.zooteam.evildoggyii.uiscreens.roleassign

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
import com.zooteam.evildoggyii.Player
import com.zooteam.evildoggyii.Routes
import com.zooteam.evildoggyii.Semantics
import com.zooteam.evildoggyii.roles.Role

@Composable
fun RoleAssignmentScreen(navController: NavHostController, game: Game, name: String) {
    var x = game.count
    var cardtable = CardTable
    Column() {
        Text(text =
            if (Semantics.vowlCheck(game.gameRoles[x].name) == 1) "$name, you are an ${game.gameRoles[x].name}"
            else "$name, you are a ${game.gameRoles[x].name}"
        )

        Image(painter = CardTable.getCard(idx = game.gameRoles[x].cardidx),
            contentDescription = game.gameRoles[x].name,
            modifier = Modifier
                .size(500.dp))

        Button(onClick = {
            if(x<game.gameRoles.size-1) {
                navController.navigate(Routes.NameEntry)
            } else navController.navigate(Routes.NightFall)
            game.playerList.add(addPlayer(game.gameRoles[x], name))
            }, modifier = Modifier
            .height(100.dp)
            .width(200.dp),
        ) {}
    }
}
fun addPlayer(role: Role, name: String): Player {
   return Player(name, role)
}