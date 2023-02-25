fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val evenNumbers = numbers.filter { isEven(it) }
    println(evenNumbers)
}

fun isEven(number: Int): Boolean {
    return number % 2 == 0
}
