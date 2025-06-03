package org.coding.shift

fun main() {
    var cord810 = Coordinate(1,2)
    val card810 = Card(810, cord810)
    println(card810)
    println(card810)
    cord810 = Coordinate(2,1)

    println(card810)

}
fun solution(cards: Array<Array<Int>>, moves: Array<Array<Int>>, query: Int): Array<Int> {
    // TODO: Implement here!
    return arrayOf(0)
}
//fun solution(cards: Array<Card>, )

data class Coordinate (
    val x: Int,
    val y: Int,
)
/**
Card has an immutable [cardID] and mutable state of cards [Coordinate] (i.e. its colum and )
 */
data class Card(
    val cardID: Int,
    var state: Coordinate,
)