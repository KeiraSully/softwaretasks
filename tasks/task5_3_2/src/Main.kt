// Task 5.3.2: main program
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Error: exactly 1 argument required (e.g., 3d8)")
        exitProcess(1)
    }

    val spec = args[0]

    val countStr = spec.substringBefore("d")
    val sidesStr = spec.substringAfter("d")

    val count = countStr.toInt()
    val sides = sidesStr.toInt()

    rollDice(sides, count)
}