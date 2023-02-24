fun calculate(n: Int, operation: (Int) -> Int): Int {
    return operation(n)
}

fun main() {

    val result = calculate(4) { x -> x * x }
    println(result) // Output: 16

}
