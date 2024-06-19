package com.zooteam.evildoggyii

class Game {
    var gameRoles = mutableListOf<Role>(Werewolf(), Seher())
    init {
       gameRoles = gameRoles.shuffled().toMutableList()
    }
}