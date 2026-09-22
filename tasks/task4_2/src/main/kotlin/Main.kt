// Task 4.2: use of if and ranges

fun main() {
    // Add your code here
    println("PIZZA MENU")
    println()
    println("(a) Margherita")
    println("(b) Quattro Stagioni")
    println("(c) Seafood")
    println("(d) Hawaiian")
    println()


    print("Choose your pizza (a-d): ")
    val input = readln().lowercase()


    if (input.length == 1 && input[0] in 'a'..'d') {
        println("Order accepted")
    } else {
        println("Invalid choice!")
    }

}
