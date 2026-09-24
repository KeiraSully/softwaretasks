// Task 4.7: finding the longest line in a file
import kotlin.io.path.Path
import kotlin.io.path.forEachLine
import kotlin.system.exitProcess

fun main(args: Array<String>) {

    val filePath = Path(args[0])

    var longestLineNumber = 0
    var longestLineLength = 0
    var currentLineNumber = 0

    filePath.forEachLine { line ->
        currentLineNumber++

        if (line.length > longestLineLength) {
            longestLineLength = line.length
            longestLineNumber = currentLineNumber
        }
    }

    if (longestLineNumber > 0) {
        println("Line $longestLineNumber is the longest (length = $longestLineLength)")
    } else {
        println("The file is empty.")
    }
}