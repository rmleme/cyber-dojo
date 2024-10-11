package org.cyber.dojo.rmleme

class Anagrams {

    fun generate(input: String): Set<String> {
        if (input.length == 1) {
            return setOf(input)
        }

        val anagrams = mutableSetOf<String>()

        val substringAnagrams = generate(input.substring(1))

        substringAnagrams.forEach {
            for (i in 0..it.length) {
                anagrams.add(it.insert(i, input[0]))
            }
        }

        return anagrams
    }
}

private fun String.insert(offset: Int, c: Char) = StringBuilder(this).apply { insert(offset, c) }.toString()
