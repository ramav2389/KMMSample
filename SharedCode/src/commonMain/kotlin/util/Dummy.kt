package util

import model.Transaction


fun getDummyTransactions(imgs: List<Int>): ArrayList<Transaction> {

    val h1 = Transaction(
        "Company1",
        "E-Commerce",
        "10.000,00 US",
        imgs[0],
        false
    )

    val h2 = Transaction(
        "Company2",
        "Travels",
        "5.000,00 US",
        imgs[1],
        false
    )

    val h3 = Transaction(
        "Company3",
        "Rental",
        "8.500,00 US",
        imgs[2],
        false
    )

    val h4 = Transaction(
        "Company4",
        "Health and wellness",
        "3.500,00 US",
        imgs[3],
        false
    )

    return arrayListOf(h1, h2, h3, h4)
}
