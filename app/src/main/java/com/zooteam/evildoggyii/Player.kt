package com.zooteam.evildoggyii

import com.zooteam.evildoggyii.roles.Role

class Player(name: String, role: Role) {
    var name: String
    var isDead: Boolean
    var role: Role
    var voteCount: Int

    init {
        this.name = name
        this.isDead = false
        this.role = role
        this.voteCount = 0
    }

    fun resetVote() {
        voteCount = 0
    }
}