package org.example.rules

import org.example.PokerHand
import org.example.Score

class HighCard(override val priority: Int =1) : PokerRule {
    override fun isTheRuleApplicable(pokerHand: PokerHand): Boolean {
        TODO("Not yet implemented")
    }

    override fun getScore(pokerHand: PokerHand): Score {
        TODO("Not yet implemented")
    }

}