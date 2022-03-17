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

//
//fun anagramas(palavraEmOrdem: String, palavraSelecionadaEmOrdem: String, novaLista: MutableList<String>):List<String> {
//    if (palavraEmOrdem == palavraSelecionadaEmOrdem) {
//        return novaLista
//    }
//    return novaLista
//}
//
////lista de palavras com a mesma quantidade de letras
//fun mesmaQuantidadeDeLetrasNaPalavra(listaDePalavras: Array<String>, palavraRecebida: String): MutableList<String> {
//    val novaLista = mutableListOf<String>()
//    val palavraAtual = palavraRecebida
//    listaDePalavras.forEach { palavraDaLista ->
//        if (palavraDaLista.length == palavraAtual.length) {
//            novaLista.add(palavraDaLista)
//        }
//    }
//    return novaLista
//}
//
////criar uma array de letras -> colocar fun em um for da listaDePalavra
//fun criarArrayDeLetras(novaLista: List<String>): MutableList<List<String>> {
//    val novaListaDeLetra = mutableListOf<List<String>>()
//    novaLista.forEach{palavra-> palavra
//        novaListaDeLetra.add(palavra.split(""))
//    }
//
//    return novaListaDeLetra
//}
//
////colocar letras dapalavra recebida em ordem alfabetica
//fun colocarLetrasDaPalavraRecebidaEmOrdemAlfabetica(palavraRecebida: String): String {
//    val palavraEmOrdem = palavraRecebida.split("").sorted().joinToString("")
//    return (palavraEmOrdem)
//}
//
////ordenar letras da palavra escolhida
//fun ordenandoPalavrasEscolhidas(listaAlualizadaDeLetra: MutableList<List<String>>): String {
//    var nova = ""
//    val palavraSelecionadaEmOrdem = listaAlualizadaDeLetra.forEach{ array ->
//        nova = array.toSortedSet().joinToString("") + array.toSortedSet().joinToString("")
//    }
//    return nova
//
//}
