fun main() {
    val customers = 10
    println("There are $customers customers")

    // Tipe Data Dasar
    val d: Int
    d = 3
    val e: String = "hello"
    println("d = $d, e = $e")

    // Collection (List, Set, Map)
    // List
    val readOnlyShapes = listOf("triangle", "square", "circle")
    println("readOnlyShapes: $readOnlyShapes")
    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
    shapes.add("rectangle")
    println("shapes mutable: $shapes")

    // Set
    val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")
    println("readOnlyFruit: $readOnlyFruit")
    val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")
    fruit.add("orange")
    println("fruit mutable: $fruit")

    // Map
    val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println("readOnlyJuiceMenu: $readOnlyJuiceMenu")
    println("The value of apple juice is: ${readOnlyJuiceMenu["apple"]}")
    val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    juiceMenu["grape"] = 150
    println("juiceMenu mutable: $juiceMenu")
}
