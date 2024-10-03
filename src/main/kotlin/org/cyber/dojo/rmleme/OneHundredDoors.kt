package org.cyber.dojo.rmleme

@Suppress("MagicNumber")
class OneHundredDoors {

    private val closedDoors = MutableList(100) { true }

    fun passByDoors(): List<Boolean> {
        for (i in 0..99) {
            for (j in i..99 step i + 1) {
                closedDoors[j] = !closedDoors[j]
            }
        }
        closedDoors.forEachIndexed { i, closed -> println("Door ${i + 1}: ${if (closed) "closed" else "open"}") }
        return closedDoors.toList()
    }
}
