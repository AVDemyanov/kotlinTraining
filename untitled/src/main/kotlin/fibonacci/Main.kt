package fibonacci

fun main() {
    println("Введите число")
    val n: Int = readLine()?.toIntOrNull() ?: return
    while (n <= 0) {
        println("Ошибка. Число должно быть больше нуля")
        readLine()?.toIntOrNull()?: return
    }
    fibonacci(n)
}
fun fibonacci (n: Int): Int {
    var number = 0
    var number2 = 1
    var fibonacci = 0
    if (n <= 0) return 0
    if (n == 2) return 1
    for (j in 0..n) {
        fibonacci = number + number2
        number = number2
        number2 = fibonacci
        if (j == n) {
            return fibonacci
        }
        println("$fibonacci")
    }
    return fibonacci
}
