package com.rama.xapoSample.util

import com.rama.xapoSample.R
import model.Payment

val imgs =
    arrayListOf(R.drawable.ic_transaction_1, R.drawable.ic_transaction_2, R.drawable.ic_transaction_3, R.drawable.ic_transaction_4)

fun getPayments(): ArrayList<Payment> {

    val p1 = Payment(
        "Unitel",
        "Internet",
        R.drawable.unitel
    )

    val p2 = Payment(
        "ENDE",
        "Energy",
        R.drawable.ende
    )

    val p3 = Payment(
        "Epal",
        "Textile",
        R.drawable.epal
    )

    val p4 = Payment(
        "Zap Fibra",
        "Internet",
        R.drawable.zap
    )

    val p5 = Payment(
        "Movicel",
        "Ecommerce",
        R.drawable.movicel
    )


    return arrayListOf(p5, p2, p1, p3, p4)
}