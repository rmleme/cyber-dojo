package org.cyber.dojo.rmleme

class CalcStats {

    fun minValue(sequence: List<Int>): Int {
        var min = Int.MAX_VALUE
        for (number in sequence) {
            if (number < min) {
                min = number
            }
        }
        return min
    }

    fun maxValue(sequence: List<Int>): Int {
        var max = Int.MIN_VALUE
        for (number in sequence) {
            if (number > max) {
                max = number
            }
        }
        return max
    }

    fun numberOfElements(sequence: List<Int>) = sequence.size

    fun average(sequence: List<Int>) = sequence.sum() / sequence.size.toDouble()
}
