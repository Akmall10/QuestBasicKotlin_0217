// Functions
fun sum(x: Int, y: Int): Int {
    return x + y
}

fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

fun printMessage(message: String) {
    println(message)
}

fun uppercaseString(string: String): String {
    return string.uppercase()
}

fun main() {
    val customers = 10
    println("There are $customers customers")

    println("Sum result: ${sum(1, 2)}")
    printMessageWithPrefix(prefix = "Log", message = "Hello")
    printMessageWithPrefix("Hello", "Log")
    printMessageWithPrefix("Hello")
    printMessage("Hello Unit")

    // Lambda expressions
    println(uppercaseString("hello"))
    println({ string: String -> string.uppercase() }("hello"))
}
