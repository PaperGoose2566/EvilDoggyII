package com.zooteam.evildoggyii

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource

object CardTable {
    @Composable
    fun getCard(idx: Int): Painter {
        when(idx) {
            0 -> return painterResource(id = R.drawable.amor) 
            1 -> return painterResource(id = R.drawable.seher)
            2 -> return painterResource(id = R.drawable.bueger)
            3 -> return painterResource(id = R.drawable.jeager)
            else -> return painterResource(id = R.drawable.placeholdercard)
        }
    }
}