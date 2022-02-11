package day1_SonarSweep

import utility.readFile

fun main() {
    val fileName = "day1.txt"
    val input = readFile(fileName)
    println(sonarSweep(input))
}

fun sonarSweep(input: List<String>): Int {
    var biggerMeasurements = 0
    input.forEachIndexed { index, s ->
        if (index != 0 && s.toInt() > input[index - 1].toInt()) {
            biggerMeasurements += 1
        }
    }
    return biggerMeasurements

}


