package org.example


class PokerHand(val cards: Set<Card>) {
    val strongestCard: Card
        get() = cards.stream().max(Card::compareTo).get()
}

