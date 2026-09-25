// Task 8.5: example of using a higher-order function

fun main() {
    // Add your testing code here
    val text = "Hello, World! 123"

    val vowels = text.howMany { it.lowercase() in "aeiou" }
    println("Vowels: $vowels")  // 3 (e, o, o)


    val digits = text.howMany { it.isDigit() }
    println("Digits: $digits")

    val uppercase = text.howMany { it.isUpperCase() }
    println("Uppercase: $uppercase")

    val spaces = text.howMany { it == ' ' }
    println("Spaces: $spaces")

    val letters = text.howMany { it.isLetter() }
    println("Letters: $letters")

    val vowels2 = text.howMany(::isVowel)
    println("Vowels (named function): $vowels2")

    val vowels3 = text.count { it.lowercase() in "aeiou" }
    println("Vowels (count): $vowels3")
}

fun isVowel(c: Char) = c.lowercase() in "aeiou"