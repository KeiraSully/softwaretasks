// Task 4.3: grade calculation using a when expression
import kotlin.system.exitProcess
import kotlin.math.roundToInt

fun main(args: Array<String>) {
    if (args.size != 3) {
        println("Error: exactly 3 marks required on command line")
        exitProcess(1)
    }

    val mark1 = args[0].toInt()
    val mark2 = args[1].toInt()
    val mark3 = args[2].toInt()

    val average = ((mark1+mark2+mark3)/3.0).roundToInt()

    val grade = when(average) {
        in 0..39 -> 'fail'
        in 40..69 -> 'pass'
        in 70..100 ->'distinction'
        else -> 'error'}

    println("Average mark: $average")
    println("Grade: $grade")

}