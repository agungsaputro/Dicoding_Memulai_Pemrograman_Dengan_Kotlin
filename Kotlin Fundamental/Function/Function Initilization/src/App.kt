// main function
fun main() {
    val user = setUser("Alfian", 19)
    println(user)

    printUser(10)
}

fun setUser(name: String, age: Int) = "Your name is $name, and you $age years old"

fun printUser(name: Int) {
    println("Your name is $name")
}