// Task 7.7.2: database-handling functions

import kotlin.io.path.Path
import kotlin.io.path.forEachLine
import kotlin.io.path.writer

typealias Database = MutableMap<String,String>

fun createDatabase() = mutableMapOf<String,String>()

fun Database.load(filename: String) {
    // Add code here to read names and numbers from the file
    // and insert them as keys and values into the map
    val map = mutableMapOf<String, String>()
    Path(filename).forEachLine {
        val parts = it.split(",")
        if (parts.size == 2) {
            map[parts[0].trim()] = parts[1].trim()
        }
    }
    return map
}

fun Database.save(filename: String) {
    // Add code here to write the keys and values of the map to
    // the file, separated by a comma, one pairing per line
    val content = this.entries.joinToString("\n") { "${it.key},${it.value}" }
    Path(filename).writeText(content)
}
