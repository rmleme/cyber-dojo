package org.cyber.dojo.rmleme

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class AlignColumnsTest : StringSpec() {

    private val alignColumns = AlignColumns()

    init {
        "Test" {
            val expectedOutput = """
Given ${'$'} a         ${'$'} text     ${'$'} file  ${'$'} of    ${'$'} many    ${'$'} lines,    ${'$'} where   ${'$'} fields${'$'} within ${'$'} a ${'$'} line${'$'}${'\u0020'}
are   ${'$'} delineated${'$'} by       ${'$'} a     ${'$'} single${'$'} 'dollar'${'$'} character,${'$'} write   ${'$'} a     ${'$'} program
that  ${'$'} aligns    ${'$'} each     ${'$'} column${'$'} of    ${'$'} fields  ${'$'} by        ${'$'} ensuring${'$'} that  ${'$'} words  ${'$'} in${'$'} each${'$'}${'\u0020'}
column${'$'} are       ${'$'} separated${'$'} by    ${'$'} at    ${'$'} least   ${'$'} one       ${'$'} space.
            """.trimMargin()

            val inputText = """
Given${'$'}a${'$'}text${'$'}file${'$'}of${'$'}many${'$'}lines,${'$'}where${'$'}fields${'$'}within${'$'}a${'$'}line${'$'}
are${'$'}delineated${'$'}by${'$'}a${'$'}single${'$'}'dollar'${'$'}character,${'$'}write${'$'}a${'$'}program
that${'$'}aligns${'$'}each${'$'}column${'$'}of${'$'}fields${'$'}by${'$'}ensuring${'$'}that${'$'}words${'$'}in${'$'}each${'$'}
column${'$'}are${'$'}separated${'$'}by${'$'}at${'$'}least${'$'}one${'$'}space.
            """.trimMargin()

            alignColumns.align(inputText).lines() shouldBe expectedOutput.lines()
        }
    }
}
