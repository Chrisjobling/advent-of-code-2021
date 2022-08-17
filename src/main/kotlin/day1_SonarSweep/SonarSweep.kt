package day1_SonarSweep

import utility.readFile

fun main() {
    val fileName = "day1.txt"
    val input = readFile(fileName)
    val intInput =input.map { it.toInt() }
    println(Day1().part1(intInput))
    println(Day1().part2(intInput))
}

class Day1 {
    fun part1(input: List<Int>): Int {
        var biggerMeasurements = 0
        input.forEachIndexed { index, s ->
            if (index != 0 && s > input[index - 1]) {
                biggerMeasurements += 1
            }
        }
        return biggerMeasurements
    }

    fun part2(input: List<Int>): Int {
        return part1(
            input.windowed(size = 3, step = 1)
            .map { it.sum() }
        )
    }
}


