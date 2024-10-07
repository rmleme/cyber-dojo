package org.cyber.dojo.rmleme

class AbcProblem {

    companion object {
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
    }

    fun canBeSpelled(word: String): Boolean {
        val usedBlocks = MutableList(blocks.size) { false }
        word.uppercase().forEach { letter ->
            blocks.forEachIndexed { i, block ->
                if (!usedBlocks[i] && letter in block) {
                    usedBlocks[i] = true
                    return@forEach
                }
            }
            return false
        }
        return true
    }
}

data class Block(
    val leftLetter: Char,
    val rightLetter: Char
) {
    operator fun contains(letter: Char) = letter == leftLetter || letter == rightLetter
}
