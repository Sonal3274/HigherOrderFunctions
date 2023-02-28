fun main() {
    val names = listOf("Alice", "Bob", "Charlie", "Alice", "David", "Bob")
    val uniqueNames = removeDuplicates(names) { it }
    println(uniqueNames)
}

fun <T, R> removeDuplicates(list: List<T>, selector: (T) -> R): List<T> {
    return list.distinctBy(selector)
}
