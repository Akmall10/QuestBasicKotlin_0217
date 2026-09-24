// ===================================================================
// QuestBasicKotlin - Pertemuan 2 (Basic Kotlin)
// Semua sub-bab digabung dalam satu file agar sekali Run,
// semua output dari 8 topik kelihatan sekaligus.
// ===================================================================

// ===== Sub-bab: Variables & String Templates =====
fun demoVariables() {
    println("\n=== Variables & String Templates ===")
    val customers = 10
    println("There are $customers customers")

    val d: Int
    d = 3
    println("d = $d")

    val e: String = "hello"
    println("e = $e")
}

// ===== Sub-bab: Tipe Data Dasar =====
fun demoDataTypes() {
    println("\n=== Tipe Data Dasar ===")
    val byteVal: Byte = 10
    val intVal: Int = 1000
    val longVal: Long = 100000L
    val floatVal: Float = 3.14f
    val doubleVal: Double = 3.14159
    val boolVal: Boolean = true
    val charVal: Char = 'K'
    val stringVal: String = "Kotlin"

    println("Byte: $byteVal, Int: $intVal, Long: $longVal")
    println("Float: $floatVal, Double: $doubleVal")
    println("Boolean: $boolVal, Char: $charVal, String: $stringVal")
}

// ===== Sub-bab: Collection (List, Set, Map) =====
fun demoCollections() {
    println("\n=== Collection (List, Set, Map) ===")

    // List
    val readOnlyShapes = listOf("triangle", "square", "circle")
    println("readOnlyShapes: $readOnlyShapes")

    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
    shapes.add("rectangle")
    println("shapes (mutable): $shapes")
    println("first: ${shapes.first()}, last: ${shapes.last()}, count: ${shapes.count()}")
    println("contains 'circle': ${"circle" in shapes}")

    // Set
    val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")
    println("readOnlyFruit: $readOnlyFruit")

    val fruit: MutableSet<String> = mutableSetOf("apple", "banana")
    fruit.add("cherry")
    println("fruit (mutable): $fruit, count: ${fruit.count()}")

    // Map
    val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println("readOnlyJuiceMenu: $readOnlyJuiceMenu")
    println("Harga jus apple: ${readOnlyJuiceMenu["apple"]}")

    val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190)
    juiceMenu["orange"] = 100
    println("juiceMenu (mutable): $juiceMenu")
    println("containsKey 'kiwi': ${juiceMenu.containsKey("kiwi")}")
}

// ===== Sub-bab: Conditional Expressions (If, When) =====
fun demoConditionalExpressions() {
    println("\n=== Conditional Expressions (If, When) ===")

    val check = true
    val ifResult: Int = if (check) 1 else 2
    println("if result: $ifResult")

    val obj = "Hello"
    when (obj) {
        "1" -> println("One")
        "Hello" -> println("Greeting")
        else -> println("Unknown")
    }

    val whenResult = when (obj) {
        "1" -> "One"
        "Hello" -> "Greeting"
        else -> "Unknown"
    }
    println("when result: $whenResult")
}

// ===== Sub-bab: Loops (Ranges & Loops) =====
fun demoLoops() {
    println("\n=== Ranges & Loops ===")

    print("For 1..5: ")
    for (number in 1..5) print(number)
    println()

    print("For 1..<4 (tanpa nilai akhir): ")
    for (number in 1..<4) print(number)
    println()

    print("downTo 4..1: ")
    for (number in 4 downTo 1) print(number)
    println()

    print("step 1..5 step 2: ")
    for (number in 1..5 step 2) print("$number ")
    println()

    var i = 0
    print("While i<5: ")
    while (i < 5) {
        print(i)
        i++
    }
    println()
}

// ===== Sub-bab: Functions =====
fun sum(x: Int, y: Int): Int = x + y

fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

fun demoFunctions() {
    println("\n=== Functions (Named Arguments, Default Params, Lambda) ===")
    println("sum(1,2) = ${sum(1, 2)}")

    printMessageWithPrefix("Hello")
    printMessageWithPrefix(prefix = "Log", message = "Hello")

    val uppercase = { s: String -> s.uppercase() }
    println("Lambda uppercase: ${uppercase("hello")}")
}

// ===== Sub-bab: Class & Data Class =====
class Contact(val id: Int, var email: String) {
    fun printId() {
        println("Contact ID: $id")
    }
}

data class User(val name: String, val id: Int)

fun demoClasses() {
    println("\n=== Class & Data Class ===")

    val contact = Contact(1, "mary@gmail.com")
    contact.printId()
    println("Email awal: ${contact.email}")
    contact.email = "jane@gmail.com"
    println("Email baru: ${contact.email}")

    val user = User("Alex", 1)
    val secondUser = User("Alex", 1)
    val thirdUser = User("Max", 2)

    println("user toString: $user")
    println("user == secondUser: ${user == secondUser}")
    println("user == thirdUser: ${user == thirdUser}")
    println("copy exact: ${user.copy()}")
    println("copy name Max: ${user.copy(name = "Max")}")
    println("copy id 3: ${user.copy(id = 3)}")
}

// ===== Sub-bab: Null Safety =====
fun strLength(notNull: String): Int = notNull.length

fun describeString(maybeString: String?): String {
    return if (maybeString != null && maybeString.length > 0) {
        "String of length ${maybeString.length}"
    } else {
        "Empty or null string"
    }
}

fun lengthString(maybeString: String?): Int? = maybeString?.length

fun demoNullSafety() {
    println("\n=== Null Safety ===")

    val neverNull: String = "This can't be null"
    var nullable: String? = "You can keep a null here"
    nullable = null

    println("neverNull length: ${strLength(neverNull)}")

    val nullString: String? = null
    println(describeString(nullString))
    println("lengthString result: ${lengthString(nullString)}")
    println("Elvis operator result: ${nullString?.length ?: 0}")
}

// ===================================================================
// MAIN - memanggil semua demo sub-bab secara berurutan
// ===================================================================
fun main() {
    demoVariables()
    demoDataTypes()
    demoCollections()
    demoConditionalExpressions()
    demoLoops()
    demoFunctions()
    demoClasses()
    demoNullSafety()
}