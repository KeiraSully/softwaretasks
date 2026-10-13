// Task 9.6: application to compute dataset variance

import kotlin.system.exitProcess

fun main(args: Array<String>) {
    // Implement main program here
    if (args.size != 1) {
        println("Error: exactly 1 argument required (data file)")
        exitProcess(1)
    }

    try {
        val data = readData(args[0])
        val v = variance(data)
        println("Dataset size: ${data.size}")
        println("Variance: %.5f".format(v))
    } catch (e: Exception) {
        println("Error: ${e.message}")
        exitProcess(1)
    }
}
