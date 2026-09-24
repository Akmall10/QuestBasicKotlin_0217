fun strLength(notNull: String): Int {
    return notNull.length
}

fun describeString(maybeString: String?): String {
    if (maybeString != null && maybeString.length > 0) {
        return "String of length ${maybeString.length}"
    } else {
        return "Empty or null string"
    }
}

fun lengthString(maybeString: String?): Int? = maybeString?.length

fun main() {
    // Null safety
    var neverNull: String = "This can't be null"
    var nullable: String? = "You can keep a null here"
    nullable = null

    println("neverNull length: ${strLength(neverNull)}")

    var nullString: String? = null
    println(describeString(nullString))
    println("lengthString result: ${lengthString(nullString)}")
    println("Elvis operator result: ${nullString?.length ?: 0}")
}
