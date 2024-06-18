package com.zooteam.evildoggyii

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController

@Composable
fun TestB(navController: NavHostController) {
    Column {
        Modifier.fillMaxSize()
    }
    Text(text = "TestB")
    Button(onClick = { navController.navigate(Routes.One) }) {
        Text(text = "Click for Test A")
    }
}