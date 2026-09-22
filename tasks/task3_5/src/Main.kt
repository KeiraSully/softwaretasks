// Task 3.5: simple file I/O

import kotlin.io.path.Path
import kotlin.io.path.appendText
import kotlin.io.path.readText
import kotlin.io.path.writeText

fun main() {
    // Add your code here
    val filePath = Path("test.txt")

    filePath.writeText("1st context in")

    filePath.writeText("2nd content, will cover 1st")

    filePath.appendText("3rd content. will be added to file")

    val contents = filePath.readText()

    println("------")
    println(contents)
    println("------")

}
