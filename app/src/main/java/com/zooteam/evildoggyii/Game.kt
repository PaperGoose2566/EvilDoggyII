package com.zooteam.evildoggyii

import com.zooteam.evildoggyii.roles.Amor
import com.zooteam.evildoggyii.roles.Role
import com.zooteam.evildoggyii.roles.Seher
import com.zooteam.evildoggyii.roles.Werewolf

class Game() {
    var gameRoles = mutableListOf<Role>(Werewolf(), Seher(), Amor())
    init {
    }

    fun fillRoleList() {

    }

    fun randomRoles() {
        // Randomises the roles
        gameRoles = gameRoles.shuffled().toMutableList()
    }
}