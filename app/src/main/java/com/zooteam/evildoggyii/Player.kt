package com.zooteam.evildoggyii

import com.zooteam.evildoggyii.roles.Role

class Player(name: String, role: Role) {
    var name: String
    var isDead: Boolean
    var role: Role

    init {
        this.name = name
        this.isDead = false
        this.role = role
    }
}