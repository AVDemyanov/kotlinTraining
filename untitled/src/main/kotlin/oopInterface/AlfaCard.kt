class AlfaCard(balance: Int, creditLimit: Int, override var cashback: Int, override var bonusPoint: Int): CreditCard(balance, creditLimit) {
    init {
        println("Вы используете кредитную карту Альфа-банка")
        getBalanceInfo()
    }

    override fun upBalance() {
        super.upBalance()
    }

    override fun pay() {
        super.pay()
    }


//    override fun avialableFuns() {
//        super.avialableFuns()
//    }

}