package main.kotlin.tryonline

import org.testng.Assert
import org.testng.annotations.Test

/**
 * Created by faragaur on 23/06/17.
 */
data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(other: MyDate): Int {
        val yearResult = this.year.compareTo(other.year)

        return when (yearResult) {
            0 -> {
                val monthResult = this.month.compareTo(other.month)
                when (monthResult) {
                    0 -> this.dayOfMonth.compareTo(other.dayOfMonth)
                    else -> monthResult
                }
            }
            else -> yearResult
        }
    }
}


fun compare(date1: MyDate, date2: MyDate) = date1 < date2

class TestComparison {

    @Test fun testBefore() {
        val first = MyDate(2014, 5, 10)
        val second = MyDate(2014, 7, 11)
        Assert.assertTrue(first < second, "compareTo: $first should go before $second")
    }

    @Test fun testAfter() {
        val first = MyDate(2014, 10, 20)
        val second = MyDate(2014, 7, 11)
        Assert.assertTrue(first > second, "compareTo: $first should go after $second")
    }
}