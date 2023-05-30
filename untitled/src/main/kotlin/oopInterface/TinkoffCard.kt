class TinkoffCard(balance: Int, creditLimit: Int, override var cashback: Int, override var bonusPoint: Int): DebitCard(balance, creditLimit) {
    init {
        println("Вы используете дебетовую карту Тинькофф банка")
        getBalanceInfo()
    }

    override fun pay() {
        super.pay()
    }
    override fun upBalance() {
        super.upBalance()
    }

    override fun getBalanceInfo() {
        super.getBalanceInfo()
    }

}