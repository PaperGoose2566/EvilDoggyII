package com.zooteam.evildoggyii

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

/*
 * Placeholder to test navigation
 * And serves as a tutorial for the front-end guy
 */
@Composable
fun TestA(navController: NavController) {
    Column {
       Modifier.fillMaxSize()
    }
    Text(text = "TestA")
    /* The onClick function uses the navController passed
     * in the function head by the MainActivity in the
     * Navigation graph and calls the navigate function, where
     * Route two is selected
     */
    Button(onClick = { navController.navigate(Routes.Two) }) {
        Text(text = "Click for Test B")
    }
}