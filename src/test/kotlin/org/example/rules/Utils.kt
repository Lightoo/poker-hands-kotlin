package org.example.rules

import org.example.Card
import org.example.Player
import org.example.PokerHand
import org.example.enums.Suit
import org.example.enums.Value

object Utils {
    fun pokerHandHighCard(): PokerHand =
         PokerHand(
            setOf(
                cardOf(Suit.Clubs, Value.FOUR),
                cardOf(Suit.Diamonds, Value.THREE),
                cardOf(Suit.Diamonds, Value.TWO),
                cardOf(Suit.Spades, Value.ACE),
                cardOf(Suit.Hearts, Value.FIVE)
            )
        )

    fun allPokerRules(): Array<PokerRule>{
        TODO()
    }
    fun playerWithHandOf(name: String, vararg cards: Card): Player {
        TODO()
    }
    fun cardOf(suit: Suit, value: Value): Card {
        return Card(suit, value)
    }
}