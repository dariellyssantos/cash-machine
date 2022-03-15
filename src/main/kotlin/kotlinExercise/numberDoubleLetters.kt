package kotlinExercise

import java.util.*


fun main() {

    println("Insira uma palavra:")
    val letters: List<String>? = readLine()?.lowercase(Locale.getDefault())?.split("")
    println(letters)
    println(letters?.let { repetitionLogic(it) })
}

fun repetitionLogic(letters: List<String>): Map<String, Int> {
    var repetitionElement = mutableMapOf<String, Int>()
    letters.forEach {
        var actualElement = it
        var numberOfOccurrences = 0
        if (!repetitionElement.containsKey(it) && it !== "") {

            letters.forEach { element ->
                if (actualElement == element) {
                    numberOfOccurrences += 1
                }

            }
            repetitionElement[actualElement] = numberOfOccurrences
        }
    }
    return repetitionElement
}


