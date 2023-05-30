package collection

fun main() {
    println("Сколько номеров хотите ввести?")
    var n = readln().toIntOrNull() ?:0
    while (n <= 0) {
        println("Введите число больше нуля")
        n = readln().toIntOrNull() ?:0
    }

    var phoneBook = telephoneBook(n)
    println("Вот список всех номеров: $phoneBook")
    var nameUser = mutableMapOf<String, String>()
    phoneBook.forEach(){
        println("Введите имя пользователя - $it")
        var name: String = readln()
        nameUser[it] = name
    }
    println("Абонент $nameUser. Номер телефона - $phoneBook")
    var filterPhoneBook = phoneBook.filter { it.startsWith("+7") }
    println("Номера, введенные с +7 - $filterPhoneBook")
    var uniqueNumber = phoneBook.toSet()
    println("Количество уникальных номеров в телефонной книге - ${uniqueNumber.size}")

}
fun telephoneBook(n: Int): List <String> {
    val listPhoneBook = mutableListOf<String>()

    for (i in 0 until n)  {
        println("Введите номер ${i + 1}")
        val phone = readln()
        listPhoneBook.add(phone)
    }
    return listPhoneBook
}





