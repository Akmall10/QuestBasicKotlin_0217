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

    // Conditional expressions (If, When)
    val check = true
    val conditionalVal = if (check) 1 else 2
    println("Conditional Int (if): $conditionalVal")

    // Loops & Ranges
    println("For loop 1..5:")
    for (number in 1..5) {
        print("$number ")
    }
    println()

    println("For loop downTo and step:")
    for (i in 5 downTo 1 step 2) {
        print("$i ")
    }
    println()

    var count = 3
    println("While loop:")
    while (count > 0) {
        println("Count: $count")
        count--
    }
}
