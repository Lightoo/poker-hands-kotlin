package org.example

import org.example.rules.PokerRule

class PokerGame(private val pokerRules: Array<PokerRule>) {
    fun play(player1: Player, player2: Player): String {
        val score1: Score = pokerRules
            .filter { pokerRule: PokerRule -> pokerRule.isTheRuleApplicable(player1.pokerHand) }
            .map{ rule: PokerRule -> rule.getScore(player1.pokerHand) }
            .max()
        val score2: Score = pokerRules
            .filter{ rule: PokerRule -> rule.isTheRuleApplicable(player2.pokerHand) }
            .map{ rule: PokerRule -> rule.getScore(player2.pokerHand) }
            .max()
        return if (score1 > score2) {
            player1.name + " wins. - with " + score1
        } else if (score1 < score2) {
            player2.name + " wins. - with " + score2
        } else {
            "Tie."
        }
    }
}
