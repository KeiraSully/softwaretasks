// Task 4.4: temperature conversion using a while loop

import kotlin.system.exitProcess

import com.github.ajalt.mordant.rendering.AnsiLevel
import com.github.ajalt.mordant.rendering.TextAlign
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal

fun main(args: Array<String>) {
    // Add your code here
    if (args.size != 3) {
        println("Error: exactly 3 arguments required")
        println("Usage: <initial_temp> <max_temp> <increment>")
        exitProcess(1)
    }

    val initialTemp = args[0].toDouble()
    val maxTemp = args[1].toDouble()
    val increment = args[2].toDouble()

    println("Celsius  Fahrenheit")
    println("-----------------")

    var celsius = initialTemp
    while (celsius <= maxTemp) {
        val fahrenheit = celsius * 9.0 / 5.0 + 32.0

        println("%5.1f    %10.1f".format(celsius, fahrenheit))

        celsius += increment
    }

}
