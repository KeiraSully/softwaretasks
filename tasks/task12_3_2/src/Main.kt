// Task 12.3.2: demo of Person class with secondary constructor
import kotlinx.datetime.LocalDate

fun main() {
    val p = Person("Alice", "1997-08-23")
    println("Name: ${p.name}")
    println("Birth: ${p.birth}")
    println("Married: ${p.isMarried}")
}