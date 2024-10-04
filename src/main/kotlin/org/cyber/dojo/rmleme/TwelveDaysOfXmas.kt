package org.cyber.dojo.rmleme

class TwelveDaysOfXmas {

    companion object {
        private val verses = listOf(
            Verse("first", "A partridge in a pear tree."),
            Verse("second", "Two turtle doves and"),
            Verse("third", "Three french hens"),
            Verse("fourth", "Four calling birds"),
            Verse("fifth", "Five golden rings"),
            Verse("sixth", "Six geese a-laying"),
            Verse("seventh", "Seven swans a-swimming"),
            Verse("eight", "Eight maids a-milking"),
            Verse("ninth", "Nine ladies dancing"),
            Verse("tenth", "Ten lords a-leaping"),
            Verse("eleventh", "Eleven pipers piping"),
            Verse("twelfth", "Twelve drummers drumming")
        )
    }

    fun outputLyrics(): String {
        val poem = StringBuilder()

        val stanza = mutableListOf<String>()
        stanza.add("")
        stanza.add("My true love gave to me:")

        verses.forEachIndexed { i, verse ->
            stanza[0] = "On the ${verse.day} day of Christmas,"
            stanza.add(stanza.size - i, verse.text)

            poem.append(stanza.joinToString(separator = "\n", postfix = "\n")).append("\n")
        }

        return poem.removeSuffix("\n\n").toString()
    }
}

data class Verse(
    val day: String,
    val text: String
)
