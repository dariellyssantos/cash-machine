package kotlinExercise

fun main() {

    val listaDePalavras: Array<String> = arrayOf("alergia", "regalia", "teste", "batata")
    val palavraRecebida:String = "estet"
    println(anagrama(palavraRecebida,listaDePalavras))
}

fun anagrama(palavraRecebida: String, listaDePalavras: Array<String>): MutableList<String> {
    val letrasDaPalavra = getLetter(palavraRecebida)
    val letrasDePalavrasOrdenadas = ordenaArrayDeLetras(letrasDaPalavra)
    val letrasDosPossiveisAnagramas = listaDePalavras.map { getLetter(it) }
    val anagramas = letrasDosPossiveisAnagramas.map {
        val possivelAnagramaOrdenado = ordenaArrayDeLetras(it)
        letrasDePalavrasOrdenadas==possivelAnagramaOrdenado
    }
    val resultado = mutableListOf<String>()
    for (i in listaDePalavras.indices){
        if(anagramas[i]){
            resultado.add(listaDePalavras[i])
        }
    }
    return resultado
}

fun getLetter(word: String): List<String> {
    return word.toCharArray().map{it.toString()}
}

fun ordenaArrayDeLetras(arrayDeLetras:List<String>): MutableList<String> {
    var arrayDeLetrasOrdenadas = mutableListOf<String>()
    arrayDeLetrasOrdenadas = arrayDeLetras.sorted() as MutableList<String>
    return arrayDeLetrasOrdenadas
}

