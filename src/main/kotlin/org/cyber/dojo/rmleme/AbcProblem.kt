package org.cyber.dojo.rmleme

class AbcProblem {

    private val blocks = listOf(
        Block(leftLetter = 'A', rightLetter = 'N'),
        Block(leftLetter = 'B', rightLetter = 'O'),
        Block(leftLetter = 'C', rightLetter = 'P'),
        Block(leftLetter = 'D', rightLetter = 'Q'),
        Block(leftLetter = 'E', rightLetter = 'R'),
        Block(leftLetter = 'F', rightLetter = 'S'),
        Block(leftLetter = 'F', rightLetter = 'S'),
        Block(leftLetter = 'G', rightLetter = 'T'),
        Block(leftLetter = 'H', rightLetter = 'U'),
        Block(leftLetter = 'J', rightLetter = 'W'),
        Block(leftLetter = 'L', rightLetter = 'Y'),
        Block(leftLetter = 'N', rightLetter = 'A'),
        Block(leftLetter = 'O', rightLetter = 'B'),
        Block(leftLetter = 'P', rightLetter = 'C'),
        Block(leftLetter = 'Q', rightLetter = 'D'),
        Block(leftLetter = 'R', rightLetter = 'E'),
        Block(leftLetter = 'T', rightLetter = 'G'),
        Block(leftLetter = 'V', rightLetter = 'I'),
        Block(leftLetter = 'X', rightLetter = 'K'),
        Block(leftLetter = 'Z', rightLetter = 'M'),
    )

    fun canBeSpelled(word: String): Boolean {
        word.uppercase().forEach { letter -> if (letter !in blocks) return false }
        return true
    }
}

data class Block(
    val leftLetter: Char,
    val rightLetter: Char,
    var used: Boolean = false
) {
    operator fun contains(letter: Char) = letter == leftLetter || letter == rightLetter
}

operator fun List<Block>.contains(letter: Char): Boolean {
    this
        .filter { !it.used }
        .forEach { block ->
            if (letter in block) {
                block.used = true
                return true
            }
        }
    return false
}
