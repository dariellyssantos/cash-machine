fun main() {
    println("Qual valor deseja sacar?")
    var amount = readLine()
    var amountNumber= amount?.toInt()
        if (amountNumber != null) {
            if (amountNumber  > 600 || amountNumber<10) {
                println (" valor não permito")
            }else{
                println ("O valor do saque será $amount reais")
                val arrayCurrencyValue: IntArray= intArrayOf(100,50,10,5,1)
                arrayCurrencyValue.forEach { index ->
                    val numberOfNotes = amountNumber / index
                    if (amountNumber % index != 0) {
                        println("voce receberá $numberOfNotes de notas de $index reais")
                    }

                    amountNumber -= (index * numberOfNotes)

                }

            }

        }
    }

