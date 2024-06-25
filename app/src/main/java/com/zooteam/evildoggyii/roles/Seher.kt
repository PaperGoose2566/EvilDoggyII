package com.zooteam.evildoggyii.roles

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import com.zooteam.evildoggyii.roles.Role

class Seher(override var name: String = "Seer") : Role() {
    override var cardidx: Int = 1
    var usedAbility: Boolean

    init {
        usedAbility = false
    }
}