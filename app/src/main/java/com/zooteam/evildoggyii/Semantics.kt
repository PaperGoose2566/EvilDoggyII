package com.zooteam.evildoggyii

object Semantics {
    fun vowlCheck(noun: String): Int {
        if (noun.first() in listOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')) {
            return 1
        } else return 0
    }
}