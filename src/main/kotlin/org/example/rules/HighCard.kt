package org.example.rules

import org.example.PokerHand
import org.example.Score

class HighCard(override val priority: Int =1) : PokerRule {
    override fun isTheRuleApplicable(pokerHand: PokerHand): Boolean = true
    override fun getScore(pokerHand: PokerHand): Score {
        val card = pokerHand.strongestCard
        return Score(priority, card, "high card: " + card.value)
    }
}