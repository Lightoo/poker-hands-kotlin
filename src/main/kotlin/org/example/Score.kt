package org.example

class Score(val priority: Int, val strongestCard: Card, var outputDisplay: String) : Comparable<Score> {
    override fun compareTo(other: Score): Int {
        return if (priority == other.priority) strongestCard.value.priority.compareTo(other.strongestCard.value.priority) else priority.compareTo(
            other.priority
        )
    }
    override fun toString(): String = outputDisplay
}
