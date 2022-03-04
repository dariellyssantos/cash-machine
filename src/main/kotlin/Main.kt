fun main() {

    println("-----Caixa eletronico -----")
    println("---------------------------")
    println(" Qual valor deseja sacar?  ")

    var amount = readLine()?.toInt()
    if (amount != null) {
        validWithdrawalAmount(amount)
        noteQuantity(amount)
    } else {
        println("Informe um valor")
    }

}

fun validWithdrawalAmount(amount: Int) {
    return if (amount > 600 || amount < 10) {
        println(" valor não permitido")
    } else {
        println("O valor do saque será $amount reais")
    }
}

fun checkDifferentCurrencies(numberOfNotes: Int, amount: Int, index: Int) {
    if (amount % index == 0) {
        return println("voce receberá $numberOfNotes de notas de $index reais")
    }
    if (amount % index != 0 && amount / index > 0) {
        println("voce receberá $numberOfNotes de notas de $index reais")
    }
}

fun returnRemainingValue(amount: Int, index: Int, numberOfNotes: Int): Int {
    return amount - (index * numberOfNotes)
}

fun noteQuantity(amount:Int) {
    val arrayCurrencyValue: IntArray = intArrayOf(100, 50, 10, 5, 1)

       arrayCurrencyValue.forEach { index ->
        val numberOfNotes = amount / index
        checkDifferentCurrencies(numberOfNotes, amount, index)
        amount = returnRemainingValue(amount, index, numberOfNotes)
    }
    main()
}
