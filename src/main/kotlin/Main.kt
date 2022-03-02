fun main() {
    println("Qual valor deseja sacar?")
    val amount = readLine()
    val amountNumber= amount?.toInt()
    if (amountNumber != null) {
        if (amountNumber  > 600) {
            println (" valor não permito")
        }else{
            val arrayCurrencyValue: IntArray= intArrayOf(100,50,10,5,1)
            arrayCurrencyValue.forEach { index -> println(index )}

            println ("O valor do saque será $amount reais")
        }

    }
}


