package org.cyber.dojo.rmleme

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.doubles.plusOrMinus
import io.kotest.matchers.shouldBe

class CalcStatsTest : StringSpec() {

    private val calcStats = CalcStats()

    init {
        "Test Min" {
            calcStats.minValue(listOf(-1, 0, 1)) shouldBe -1
        }

        "Test Max" {
            calcStats.maxValue(listOf(-1, 0, 1)) shouldBe 1
        }

        "Test NumberOf" {
            calcStats.numberOfElements(listOf(-1, 0, 1)) shouldBe 3
        }

        "Test Average" {
            calcStats.average(listOf(1, 2, 1)) shouldBe (1.33 plusOrMinus 0.01)
        }
    }
}
