package function
fun main() {
println (firstString(message = """F2p)v"y233{0->c}ttelciFc"""))
 println (secondString(message = """F2p)v"y233{0->c}ttelciFc"""))
}
fun firstString (message: String) {
    var first: String = message.dropLast(message.length/2)
    val shiftedFirstString = first.map {char -> char + 1}.joinToString("")
    var symbolS = shiftedFirstString.replace('5', 's', false)
    var symbolU = symbolS.replace('4', 'u', false)
    val shiftedFirstString1 = symbolU.map {char -> char - 3}.joinToString("")
    var symbolsO = shiftedFirstString1.replace('0', 'o', false)
    println(symbolsO)
}
fun secondString(message: String) {
    var second: String = message.drop(message.length/2)
    var reversSecond = second.reversed()
    val shiftedSecondString = reversSecond.map { char -> char - 4 }.joinToString ("")
 //   var symbolprobel = shiftedSecondString.replace('_',' ',false)
    println(shiftedSecondString)
}

