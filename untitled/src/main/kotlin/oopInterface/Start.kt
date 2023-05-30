fun main() {
    val alfa = AlfaCard(balance = 1000, creditLimit = 0, bonusPoint = 0, cashback = 0)
    alfa.upBalance()
    alfa.pay()
    alfa.avialableFuns()

    val tinkoff = TinkoffCard(balance = 500, creditLimit = 0, cashback = 0, bonusPoint = 0)
    tinkoff.upBalance()
    tinkoff.pay()
    tinkoff.avialableFuns()


}