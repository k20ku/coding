package org.coding.reservasion
import java.time.LocalTime


class Reservasion

fun Reservasion.add(){}

data class Interval(val start: LocalTime, val end: LocalTime){
    /**
     * false for below two case
     * --|.end(this) |---|(other) or |---| |.start ---|.end
     */
    fun isDuplicateWith(other: Interval): Boolean {
        // up is
        return if (this.end <= other.start) {
            false
        } else {
            if (this.start >= other.end) false else true
        }
    }
}
fun main() {

}

//data class Time()
fun <T> T.pln() = println(this)