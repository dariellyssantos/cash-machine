fun main() {

    println("---------------------------")
    println("-----Caixa eletronico -----")
    println("---------------------------")
    println("Deseja fazer uma operação?")
    println("   1- SIM     2-NÃO")

    when (readLine()?.toInt()) {
        1 -> playSystem()
    }
}


fun playSystem() {
    println(" Qual valor deseja sacar?  ")
    val amount = readLine()?.toInt()
    if (amount != null) {
        validWithdrawalAmount(amount)
        noteQuantity(amount)
    } else {
        println("Informe um valor")
    }
}

fun validWithdrawalAmount(amount: Int) {
    if (amount > 600 || amount < 10) {
        println(" Valor não permitido")
    } else {
        println("O valor do saque será $amount reais")
    }
}

fun checkDifferentCurrencies(numberOfNotes: Int, amount: Int, ballot: Int) {
    if (numberOfNotes > 0) {
        println(" $numberOfNotes de notas de $ballot reais ")
    }
}

fun returnRemainingValue(amount: Int, ballot: Int, numberOfNotes: Int): Int {
    return amount - (ballot * numberOfNotes)
}

fun noteQuantity(amount: Int) {
    val arrayCurrencyValue: IntArray = intArrayOf(100, 50, 10, 5, 1)

    var rest = amount

    arrayCurrencyValue.forEach { ballot ->
        val numberOfNotes = rest / ballot
        if (amount % ballot == 0 || amount % ballot != 0 && amount / ballot > 0) {
            checkDifferentCurrencies(numberOfNotes, rest, ballot)
            rest = returnRemainingValue(rest, ballot, numberOfNotes)
        }
    }
}

