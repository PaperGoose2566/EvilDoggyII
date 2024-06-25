package com.zooteam.evildoggyii

import android.content.Context
import com.zooteam.evildoggyii.roles.Amor
import com.zooteam.evildoggyii.roles.Hunter
import com.zooteam.evildoggyii.roles.Role
import com.zooteam.evildoggyii.roles.Seher
import com.zooteam.evildoggyii.roles.Villager
import com.zooteam.evildoggyii.roles.Werewolf
import com.zooteam.evildoggyii.roles.Witch

class Game() {
    // List of active Roles
    var gameRoles: MutableList<Role>
    // List of current Players
    var playerList: MutableList<Player>

    var playerCount: Int = 0
    var werewolfCount: Int = 2

    // Temporary solution so I don't kill myself
    var dumb = 0

    // Cycles through lists, useful for not resetting position after screen changes
    var count = -1

    init {
        gameRoles = mutableListOf<Role>(Seher(), Amor(), Witch(), Hunter())
        playerList = mutableListOf<Player>()
    }

    fun fillList() {
        for(i in 0..werewolfCount-1) {
            gameRoles.add(Werewolf())
        }
        for(j in (gameRoles.size+werewolfCount)..playerCount+1) {
            gameRoles.add(Villager())
        }
        gameRoles = gameRoles.shuffled().toMutableList()
    }

    fun nightInit() {
       count = 0
    }
}