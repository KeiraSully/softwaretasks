// Task 5.1.1: main program
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    if (args.size != 2) {
        println("Error: exactly 2 words required")
        exitProcess(1)
    }

    val result = anagrams(args[0], args[1])

    if (result) {
        println("\"${args[0]}\" and \"${args[1]}\" are anagrams.")
    } else {
        println("\"${args[0]}\" and \"${args[1]}\" are NOT anagrams.")
    }
}