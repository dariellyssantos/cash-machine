package ties

fun main() {
    val numberList: List<Int> = listOf(1, 2, 3, 4, 5, 6)
    println(sumNumberReduce(numberList))
    println(sumNumberForEach(numberList))
}

fun sumNumberReduce(numberList: List<Int>): Int {

    return numberList.reduce { acc, number -> acc + number }
}

fun sumNumberForEach(numberList: List<Int>): Int {
    var previousNumber=0
    numberList.forEach { number: Int ->
        previousNumber += number
    }
    return previousNumber
}