package day1_SonarSweep

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class SonarSweepKtTest {
    @Test
    fun sonarSweepPart1IsValid() {
        val day1 = Day1()
        assertEquals(7, day1.part1(listOf(199, 200, 208, 210, 200, 207, 240, 269, 260, 263)))
        assertEquals(0, day1.part1(listOf(10,9,8,7,6,5,4,3,2,1)))
        assertEquals(1, day1.part1(listOf(10,9,8,7,6,99,4,3,2,1)))
    }

    @Test
    fun sonarSweepPart2IsValid() {
        val day1 = Day1()
        assertEquals(1, day1.part2(listOf(199,200,666,399,188,377,288)))
        assertEquals(3, day1.part2(listOf(1,1,2,2,3,4)))
        assertEquals(0, day1.part2(listOf()))
    }
}