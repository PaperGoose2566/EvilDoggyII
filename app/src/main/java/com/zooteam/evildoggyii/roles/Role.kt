package com.zooteam.evildoggyii.roles

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource

abstract class Role {
    abstract var name: String
    abstract var cardidx: Int
}