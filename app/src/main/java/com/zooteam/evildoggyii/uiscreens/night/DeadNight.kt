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

@Composable
fun DeadNight(navController: NavHostController, game: Game) {
    Column {
        Text(text = "You are dead and do nothing tonight")
        Button(onClick = {game.count++; navController.navigate(Routes.Trans)}, modifier = Modifier.width(70.dp).height(25.dp)) {

        }
    }
}
