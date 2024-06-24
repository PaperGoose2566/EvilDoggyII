package com.zooteam.evildoggyii

import android.content.Context
import com.zooteam.evildoggyii.roles.Amor
import com.zooteam.evildoggyii.roles.Hunter
import com.zooteam.evildoggyii.roles.Mayor
import com.zooteam.evildoggyii.roles.Role
import com.zooteam.evildoggyii.roles.Seher
import com.zooteam.evildoggyii.roles.Villager
import com.zooteam.evildoggyii.roles.Werewolf
import com.zooteam.evildoggyii.roles.Witch

class Game() {
    lateinit var ctx: Context
    var gameRoles: MutableList<Role>
    private var playerCount: Int = 0
    private var werewolfCount: Int = 2

    init {
        gameRoles = mutableListOf<Role>(Seher(), Amor(), Mayor(), Witch(), Hunter())
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

    fun setPlayerCount(x: Int) {
       playerCount = x
    }
    fun setWerewolfCount(x: Int){
        werewolfCount = x
    }

    fun getPlayerCount(): Int {
       return playerCount
    }

    fun fillRoleList() {

    }

    fun randomRoles() {
        // Randomises the roles
        gameRoles = gameRoles.shuffled().toMutableList()
    }

    fun setContent(ctx: Context) {
       this.ctx = ctx
    }
}