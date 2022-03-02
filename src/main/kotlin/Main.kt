fun main() {
    println("Qual valor deseja sacar?")
    val amount = readLine()
    val amountNumber= amount?.toInt()
    if (amountNumber != null) {
        if (amountNumber  > 600 || amountNumber<10) {
            println (" valor não permito")
        }else{
            println ("O valor do saque será $amount reais")
            val arrayCurrencyValue: IntArray= intArrayOf(100,50,10,5,1)
            arrayCurrencyValue.forEach { index ->
                //verifica se tem nota de 100
                if (amountNumber%index == 0){
                    val numberOfNotes = amountNumber/index
                    return  println("voce receberá $numberOfNotes de notas de $index reais" )
                }
            }

        }

    }}


