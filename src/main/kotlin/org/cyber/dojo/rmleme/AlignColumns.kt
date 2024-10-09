package org.cyber.dojo.rmleme

class AlignColumns {

    fun align(inputText: String): String {
        val remainingInputText = inputText.lines().toMutableList()
        val outputText = MutableList(remainingInputText.size) { "" }

        do {
            val maxSeparatorIndex = remainingInputText.maxOf { line ->
                line.indexOf(SEPARATOR).let { if (it == -1) line.length else it }
            }

            remainingInputText.forEachIndexed { i, line ->
                val separatorIndex = line.indexOf(SEPARATOR)
                if (separatorIndex == -1) {
                    outputText[i] += line.substring(0)
                    remainingInputText[i] = ""
                } else {
                    outputText[i] +=
                        line.substring(0, separatorIndex) +
                        " ".repeat(maxSeparatorIndex - separatorIndex) +
                        "$SEPARATOR "
                    remainingInputText[i] = line.substring(separatorIndex + 1)
                }
            }
        } while (remainingInputText.any { it.isNotEmpty() })

        return outputText.joinToString(System.lineSeparator())
    }

    companion object {
        private const val SEPARATOR = "$"
    }
}
