package org.cyber.dojo.rmleme

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class AnagramsTest : StringSpec() {

    private val anagrams = Anagrams()

    init {
        "Test" {
            val expectedAnagrams =
                setOf(
                    "bior", "biro", "boir", "bori", "brio", "broi",
                    "ibor", "ibro", "iobr", "iorb", "irbo", "irob",
                    "obir", "obri", "oibr", "oirb", "orbi", "orib",
                    "rbio", "rboi", "ribo", "riob", "robi", "roib"
                )

            anagrams.generate("biro") shouldBe expectedAnagrams
        }
    }
}
