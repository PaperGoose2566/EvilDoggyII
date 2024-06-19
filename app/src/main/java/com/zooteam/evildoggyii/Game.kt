package com.zooteam.evildoggyii

class Game {
    var gameRoles = mutableListOf<Role>(Werewolf(), Seher(), Amor())
    init {
       gameRoles = gameRoles.shuffled().toMutableList()
    }
}