fun printMessages(messages: List<String>, formatter: ((String) -> String)? = null) {
    for (message in messages) {
        val formattedMessage = formatter?.invoke(message) ?: message
        println(formattedMessage)
    }
}

fun main() {
    val messages = listOf("Hello", "World", "Kotlin")
    printMessages(messages) // Output: Hello World Kotlin
    printMessages(messages) { it.toUpperCase() } // Output: HELLO WORLD KOTLIN
}
