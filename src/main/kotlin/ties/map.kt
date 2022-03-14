package ties

fun main() {
    val numberList: List<Int> = listOf(1, 2, 3, 4, 5, 6)
    println(doubleNumberMap(numberList))
    println(doubleNumberFor(numberList))
}

fun doubleNumberMap(numberList: List<Int>): List<Int> {
    return numberList.map { double(it) }
}


fun doubleNumberFor(numberList: List<Int>): MutableList<Int> {
    val newList = mutableListOf<Int>()
    for (number in numberList) {
        newList.add(double(number))
    }
    return newList
}

fun double(number: Int): Int {
    return number * 2
}
