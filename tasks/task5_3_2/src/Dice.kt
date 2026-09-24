// Task 5.3.2: rollDice() function
import kotlin.random.Random

// 关键：两个参数都有默认值
fun rollDice(sides: Int = 6, count: Int = 1) {
    if (sides in setOf(4, 6, 8, 10, 12, 20)) {
        println("Rolling $count d$sides...")
        var total = 0
        repeat(count) {
            total += Random.nextInt(1, sides + 1)
        }
        println("Total score: $total")
    } else {
        println("Error: cannot have a $sides-sided die")
    }
}