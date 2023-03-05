inline fun List<String>.myMap(x: (String) -> String): List<String> {
    val destination = ArrayList<String>()
    for (element in this) {
        destination.add(x(element))
    }
    return destination
}

fun main() {
    val names = listOf("Alice", "Bob", "Charlie")

    // Example of using myMap to transform a list of names to uppercase
    val uppercaseNames = names.myMap { it.toUpperCase() }
    println("Uppercase names: $uppercaseNames")
}
