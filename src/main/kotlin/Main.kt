fun main() {
    println("Qual valor deseja sacar?")
    val amount = readLine()
    val amountNumber= amount?.toInt()
    if (amountNumber != null) {
        if (amountNumber  > 600) {
            println (" valor não permito")
        }else{
            println ("O valor do saque será $amount reais")
        }
    }
}


