package com.zooteam.evildoggyii

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.ui.AppBarConfiguration
import com.google.android.material.navigation.NavigationView.OnNavigationItemSelectedListener
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

        Image(painter = cardtable.getCard(idx = game.gameRoles[x].cardidx),
            contentDescription = game.gameRoles[x].name,
            modifier = Modifier
                .size(500.dp))
        Text(text = "${game.playerCount}")
        Text(text = "$x")

        Button(onClick = {
            if(x<game.gameRoles.size-1) {
                navController.navigate(Routes.NameEntry)
            }}, modifier = Modifier
            .height(100.dp)
            .width(200.dp)) {}
    }
    game.playerList.add(addPlayer(game.gameRoles[x], name))
}
fun addPlayer(role: Role, name: String): Player {
   return Player(name, role)
}