package main.kotlin

import java.math.BigDecimal

data class Money(val amount: BigDecimal, val currency: String) {
    operator fun plus(other: Money): Money {
        return Money(this.amount + other.amount, this.currency)
    }
}

//fun - keyword = YOU ALWAYS FUN HAVE WITH KOTLIN
// main-function name
//(parameters)
//: Unit
// { block}

fun main(args: Array<String>) {
    val users = loadUsers()

    val (_, username, _) = users.filter { it.email.endsWith("@kotlin.com") }
            .sortedBy { it.id }
            .first()

    println(username)

    val blackHeadphones = Money(500.bd, "EUR")
    val whiteHeadphones = blackHeadphones.copy(amount = 400.bd)

    if (blackHeadphones == whiteHeadphones) {
        println("They are the same!")
    }

    val percentOf = whiteHeadphones percentOf blackHeadphones
    println(percentOf)

    val money = whiteHeadphones + blackHeadphones

    println(money)


}

private val Int.bd: BigDecimal
    get() {
        return BigDecimal(this)
    }

infix fun Money.percentOf(other: Money) = this.amount * BigDecimal(100) / other.amount