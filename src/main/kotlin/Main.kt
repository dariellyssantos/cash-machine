fun main() {

    println("-----Caixa eletronico -----")
    println("---------------------------")
    println(" Qual valor deseja sacar?  ")

    val amount = readLine()?.toInt()
    if (amount != null) {
        validWithdrawalAmount(amount)
        noteQuantity(amount)
    } else {
        println("Informe um valor")
    }

    println("Deseja fazer nova operação?")
    println("   1- SIM     2-NÃO")

    val restart = readLine()?.toInt()

    if (restart == 1) {
        backToStart()
    }
}

fun validWithdrawalAmount(amount: Int) {
    if (amount > 600 || amount < 10) {
        println(" valor não permitido")
    } else {
        println("O valor do saque será $amount reais")
    }
}

fun checkDifferentCurrencies(numberOfNotes: Int, amount: Int, ballot: Int) {
    if (amount % ballot == 0) {
        println("voce receberá $numberOfNotes de notas de $ballot reais")
    } else if (amount % ballot != 0 && amount / ballot > 0) {
        println("voce receberá $numberOfNotes de notas de $ballot reais")
    }
}

fun returnRemainingValue(amount: Int, ballot: Int, numberOfNotes: Int): Int {
    return amount - (ballot * numberOfNotes)
}

fun noteQuantity(amount: Int) {
    val arrayCurrencyValue: IntArray = intArrayOf(100, 50, 10, 5, 1)

    var rest = amount

    val numberOfNotes = rest / ballot
    checkDifferentCurrencies(numberOfNotes, rest, ballot)
    rest = returnRemainingValue(rest, ballot, numberOfNotes)
}
}

fun backToStart() {
    return main()
}
