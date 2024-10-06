package org.example.rules

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class PokerRuleTest {

    private lateinit var pokerRule: PokerRule

    @Test
    fun highCard_rule_is_applicable() {
        pokerRule = HighCard()
        Assertions.assertTrue(pokerRule.isTheRuleApplicable(Utils.pokerHandHighCard()))
    }

}