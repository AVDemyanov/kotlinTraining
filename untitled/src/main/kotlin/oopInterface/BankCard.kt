import java.lang.NullPointerException
import java.math.BigDecimal

abstract class BankCard(
   open var balance: Int,
   open var creditLimit: Int,
)
{
    abstract var cashback: Int
    abstract var bonusPoint: Int

        open fun upBalance() {
        println("На какую сумму хотите пополнить карту?")
        val n = readln().toInt()
        balance += n
        println("Ваш баланс теперь $balance")
        
    }
    open fun pay() {
        println("На какую сумму вы желаете провести оплату?")
        val n = readln().toInt()
        balance -= n
        bonusPoint = (balance * 0.10).toInt()
            if (balance <= 0) println("Ошибка, недостаточно средст на карте")
            else println("Оплата прошла успешно. Ваш новый баланс - $balance, вам начислен кэшбек - $bonusPoint")
                               }

   open fun getBalanceInfo() {
        println(
            """
            Баланс карты - $balance
            Вы накопили бонусных баллов - $bonusPoint
            Вы накопили кэшбек - $cashback
        """.trimIndent(),
        )
    }
     open fun avialableFuns() {}

 }