package kotlinExercise

fun main() {

    println("Insira uma palavras separadas por ','")
    val listOfWords: List<String>? = readLine()?.split(",")
    println(listOfWords?.let { logicAnagram(it) })
//    println(listOfWords?.let { logicAnagram(it) }?.let { sizeList(listOfWords, it) })
}

fun logicAnagram(listOfWords: List<String>): MutableList<List<String>> {
    val newListLetter = mutableListOf<List<String>>()
    for (letter in listOfWords) {
        newListLetter.add(letter.split(""))
    }
    return newListLetter
}

fun sizeList(listOfWords: List<String>?, newListLetter: MutableList<List<String>>): MutableMap <String, Int> {
    val newList = mutableMapOf<String,Int>()
    listOfWords?.forEach { _ ->

        var numberOfRepetitions = 0
        var letter = newListLetter[0][0]

        newListLetter.forEach { element ->

            if (letter == element) {
                numberOfRepetitions += 1
                letter=element
            }
        }
        newList[letter] = numberOfRepetitions
    }
    return newList
}
//

//alergia,regalia,teste,batata


