// Task 7.7.2: phone book simulator

const val CSV_FILENAME = "phone.csv"

fun main() {
    // Implement the main program here
    // (You can add other functions to this file if you wish)
    val filename = args[0]
    var database = emptyDatabase().loadFromFile(filename)

    while (true) {
        print("Enter a name (or 'quit' to exit): ")
        val name = readln().trim()

        if (name == "quit") {
            break
        }
        if (name.isEmpty()) {
            println("Name cannot be empty.")
            continue
        }

        val number = database[name]
        if (number != null) {
            println("$name: $number")
        } else {
            print("Name not found. Enter phone number for $name: ")
            val newNumber = readln().trim()
            if (newNumber.isEmpty()) {
                println("Phone number cannot be empty.")
                continue
            }

            database = database + (name to newNumber)
            database.saveToFile(filename)
            println("Saved: $name -> $newNumber")
        }
    }}
