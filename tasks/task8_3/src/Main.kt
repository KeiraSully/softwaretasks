// Task 8.3: weather station temperature analysis program

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Add your code here

    val dataset = fetchData(args[0])

    val coldest = dataset.minBy { it.second }
    val warmest = dataset.maxBy { it.second }
    println("Coldest: ${coldest.first} (${coldest.second}°)")
    println("Warmest: ${warmest.first} (${warmest.second}°)")

    val avg = dataset.map { it.second }.average()
    println("Average: %.2f".format(avg))

    println("\nSorted by station name:")
    dataset.sortedBy { it.first }.forEach { println(it) }
}
