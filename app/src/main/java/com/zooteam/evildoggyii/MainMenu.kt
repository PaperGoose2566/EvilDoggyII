package com.zooteam.evildoggyii

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun MainMenu(navController: NavHostController) {
    Column(
        modifier = Modifier.fillMaxSize().paddingFromBaseline(100.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(text = "Werewolf - Among Us but with a dog", fontSize = 20.sp)
        Button(onClick = { navController.navigate(Routes.RoleAssignment) },
               modifier = Modifier.padding(50.dp).width(300.dp).height(100.dp)) {
            Text(text = "Click to Start!", fontSize = 30.sp )
        }
    }
}