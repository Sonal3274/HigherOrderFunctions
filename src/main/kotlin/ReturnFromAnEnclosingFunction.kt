fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val result = numbers.map {
        if (it == 3) {
            return@map "three" // return from enclosing function
        } else {
            "number $it" // return from lambda
        }
    }
    println(result)
}
