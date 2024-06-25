package com.zooteam.evildoggyii.uiscreens.roleassign

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.zooteam.evildoggyii.Game
import com.zooteam.evildoggyii.Routes

@Composable
fun NameEntry(navController: NavHostController, game: Game) {
    var pname by remember {
        mutableStateOf("")
    }
    Column {
        TextField(value = pname,
            maxLines = 1,
            onValueChange = {if (it.length < 20) pname = it},
            label = {
                Text("Enter Your Name, Player!")
            },
            singleLine = true
            )

        Button(onClick = {
            game.count++
            if(pname != "") {
                navController.navigate(Routes.RoleAssignment +"/${pname}")
            } else
                // Fallback if the name string is empty to prevent crash
                navController.navigate(Routes.RoleAssignment +"/NO NAME")
                         }, modifier = Modifier
            .height(100.dp)
            .width(200.dp)) {
        }
    }
}