// Task 5.4.1: main program
fun main() {
    val shortStr = "Hello"
    val longStr = "This is a very long string that exceeds twenty characters"
    val exactStr = "12345678901234567890"

    println("shortStr is too long? ${shortStr.isTooLong()}")
    println("longStr is too long? ${longStr.isTooLong()}")
    println("exactStr is too long? ${exactStr.isTooLong()}")
}