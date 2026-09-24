fun main() {
    val customers = 10
    println("There are $customers customers")

    // Tipe Data Dasar
    val dVar: Int
    dVar = 3
    val eStr: String = "hello"
    println("d = $dVar, e = $eStr")

    // Collection (List, Set, Map)
    val readOnlyShapes = listOf("triangle", "square", "circle")
    println("readOnlyShapes: $readOnlyShapes")
    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
    shapes.add("rectangle")
    println("shapes mutable: $shapes")

    // Conditional expressions (If, When)
    val check = true
    val conditionalVal: Int
    if (check) {
        conditionalVal = 1
    } else {
        conditionalVal = 2
    }
    println("Conditional Int (if): $conditionalVal")

    val obj = "Hello"
    when (obj) {
        "1" -> println("One")
        "Hello" -> println("Greeting")
        else -> println("Unknown")
    }

    val result = when (obj) {
        "1" -> "One"
        "Hello" -> "Greeting"
        else -> "Unknown"
    }
    println("Conditional result (when): $result")
}
