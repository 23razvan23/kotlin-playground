package main.kotlin.tryonline

/**
 * Created by faragaur on 23/06/17.
 */

fun main(args: Array<String>): Unit {
    val strings = listOf("a", "b")
    "a" in strings // strings.contains
    "a" !in strings
}

class DateRange(val start: MyDate, val endInclusive: MyDate) {
    //required for using 'in' operator
    operator fun contains(d: MyDate): Boolean {
        return start < d && d <= endInclusive
    }
}

fun checkInRange(date: MyDate, first: MyDate, last: MyDate) = date in DateRange(first, last)

