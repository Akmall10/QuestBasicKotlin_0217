// Class
class Customer

class Contact(val id: Int, var email: String) {
    fun printId() {
        println("Contact ID: $id")
    }
}

// Data classes
data class User(val name: String, val id: Int)

fun main() {
    val contact = Contact(1, "mary@gmail.com")
    contact.printId()
    println("Initial email: ${contact.email}")
    contact.email = "jane@gmail.com"
    println("Updated email: ${contact.email}")

    val user = User("Alex", 1)
    val secondUser = User("Alex", 1)
    val thirdUser = User("Max", 2)

    println("User toString: $user")
    println("user == secondUser: ${user == secondUser}")
    println("user == thirdUser: ${user == thirdUser}")

    println("Copy exact: ${user.copy()}")
    println("Copy name Max: ${user.copy("Max")}")
    println("Copy id 3: ${user.copy(id = 3)}")
}
