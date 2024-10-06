package org.example

import org.example.enums.Suit
import org.example.enums.Value

data class Card(val suit: Suit, val value: Value) : Comparable<Card>{
    override fun compareTo(other: Card): Int = value.priority.compareTo(other.value.priority)

}
