package day1_SonarSweep

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class SonarSweepKtTest {
    @Test
    fun sonarSweepPart1IsValid() {
        assertEquals(7, sonarSweep( listOf("199","200","208","210","200","207","240","269","260","263")))
        assertEquals(0, sonarSweep( listOf("10","9","8","7","6","5","4","3","2","1")))
        assertEquals(1, sonarSweep( listOf("10","9","8","7","99","5","4","3","2","1")))
    }
}