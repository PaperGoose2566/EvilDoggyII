package com.zooteam.evildoggyii

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.IntState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun RoleAssignmentScreen(navController: NavHostController, game: Game) {
    var x by remember { mutableIntStateOf(0)}
    var ctx = LocalContext.current
    game.setContent(ctx)
    Column() {
        Text(text = "Current Role: ${game.gameRoles[x].name}")
        Button(onClick = {if(x<game.gameRoles.size-1) x++}, modifier = Modifier
            .height(100.dp)
            .width(200.dp)) {

        }
        Text(text = "${game.getPlayerCount()}")
        Text(text = "${game.gameRoles.size}")
    }
}