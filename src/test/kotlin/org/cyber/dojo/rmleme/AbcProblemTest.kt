package org.cyber.dojo.rmleme

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class AbcProblemTest : StringSpec() {

    init {
        "Test A" {
            val abcProblem = AbcProblem()
            abcProblem.canBeSpelled("A") shouldBe true
        }

        "Test BARK" {
            val abcProblem = AbcProblem()
            abcProblem.canBeSpelled("BARK") shouldBe true
        }

        "Test BOOK" {
            val abcProblem = AbcProblem()
            abcProblem.canBeSpelled("BOOK") shouldBe false
        }

        "Test TREAT" {
            val abcProblem = AbcProblem()
            abcProblem.canBeSpelled("TREAT") shouldBe true
        }

        "Test COMMON" {
            val abcProblem = AbcProblem()
            abcProblem.canBeSpelled("COMMON") shouldBe false
        }

        "Test SQUAD" {
            val abcProblem = AbcProblem()
            abcProblem.canBeSpelled("SQUAD") shouldBe true
        }

        "Test CONFUSE" {
            val abcProblem = AbcProblem()
            abcProblem.canBeSpelled("CONFUSE") shouldBe true
        }
    }
}
