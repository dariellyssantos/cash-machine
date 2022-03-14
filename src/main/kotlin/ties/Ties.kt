package ties


fun main() {
    val numberList = listOf(1, 2, 3, 4, 5, 6)

    println("Escolha uma função para extrair os pares da lista?")
    println("   1- list  2-for   3-forEach ")

    when (readLine()?.toInt()) {
        1 -> println( tieList(numberList))
        2 -> println(tieFor(numberList))
        3 -> println(tieForEach(numberList))
    }
}

fun tieFor(numberList: List<Int>): MutableList<Int> {
    val newList = mutableListOf<Int>()
    for (pair in numberList) {
       if (isEven(pair)){
           newList.add(pair)
       }
    }
    return newList
}

fun isEven(number: Int): Boolean {
    return number % 2 == 0
}

fun tieForEach(numberList: List<Int>): MutableList<Int> {
    val newList = mutableListOf<Int>()
    numberList.forEach { number: Int ->
        if (isEven(number)){
            newList.add(number)
        }
    }
    return newList
}


fun tieList(numberList: List<Int>): List<Int> {
   return divisor(numberList,2)

}
 fun divisor(list:List<Int>, divisor:Int): List<Int>{
     return list.filter {it % divisor == 0}
 }
