package org.example.rules

import org.example.PokerHand
import org.example.Score


interface PokerRule {
    fun isTheRuleApplicable(pokerHand: PokerHand?): Boolean
    fun getScore(pokerHand: PokerHand?): Score?
    val priority: Int
}
