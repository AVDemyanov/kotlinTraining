import kotlin.math.min
import kotlin.random.Random
import kotlin.random.nextInt

abstract class CreditCard(balance: Int, creditLimit: Int): BankCard(balance, creditLimit) {
   override var creditLimit = 10000
    var creditFunds = Random.nextInt(0..creditLimit)
   //   open var overDraft = min(0, balance)

       override fun upBalance() {
        println("На какую сумму хотите пополнить карту?")
        val n = readln().toInt()
       if (n != null) {
           creditFunds += n
           val overCharge: Int = maxOf(0, creditFunds - creditLimit)
           balance += overCharge
           creditFunds = minOf(creditLimit, creditFunds)
           println("Карта пополнена успешно")
       } else println("Ошибка пополнения карты")
         getBalanceInfo()
    }

    override fun pay() {
        println("На какую сумму вы желаете провести оплату?")
        val n = readln().toInt()
        if (n != null) {
            if (n >= creditFunds + balance) println("У вас недостаточно средств")
            else {
                creditFunds -= n
                val overDraft = minOf(0, balance)
                creditFunds += overDraft
                balance = maxOf(0, balance)
                println("Оплата прошла успешно.")
            }
        }
        else println("Введена некорректная сумма")
        bonusPoint = (balance * 0.10).toInt()
        cashback = ((n / 100) * 5)
        getBalanceInfo()
           }

    override fun getBalanceInfo() {
        println("""
            Благодарим на использование нашего банка
            Ваш кредитный баланс - $creditFunds, лимит - $creditLimit
            Ваши собственные средства - $balance
            Вам начислено бонусных баллов - $bonusPoint
            Вам начислено кэшбека - $cashback
            
        """.trimIndent())
    }

    override fun avialableFuns() {
        println("""
            Вам доступны:
            Кредитные средства - $creditFunds, лимит - $creditLimit
            Собственные средства - $balance
            Бонусные баллы - $bonusPoint
            Кэшбек - $cashback
        """.trimIndent() )
            }


}