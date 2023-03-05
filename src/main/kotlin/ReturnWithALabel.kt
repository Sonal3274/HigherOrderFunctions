fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val result = numbers.map label@{
        if (it == 3) {
            return@label "three" // return from labeled lambda
        } else {
            "number $it" // return from lambda
        }
    }
    println(result)
}
