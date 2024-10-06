package org.example

import org.example.enums.Suit
import org.example.enums.Value
import org.example.rules.Utils.allPokerRules
import org.example.rules.Utils.cardOf
import org.example.rules.Utils.playerWithHandOf
import org.example.rules.Utils.pokerHandHighCard
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class PokerGameTest {

    private lateinit var pokerGame: PokerGame
    @BeforeEach
    fun setUp() {
        pokerGame = PokerGame(allPokerRules())
    }

    @Test
    fun win_the_game_with_HighCard_rule() {
        val player1 = Player(PLAYER1, pokerHandHighCard())
        val player2: Player = playerWithHandOf(
            PLAYER2,
            cardOf(Suit.Clubs, Value.FOUR),
            cardOf(Suit.Diamonds, Value.THREE),
            cardOf(Suit.Diamonds, Value.TWO),
            cardOf(Suit.Spades, Value.NINE),
            cardOf(Suit.Hearts, Value.FIVE)
        )
        assertEquals("player1 wins. - with high card: ACE", pokerGame.play(player1, player2))
    }

    companion object {
        private const val PLAYER1 = "player1"
        private const val PLAYER2 = "player2"
    }
}