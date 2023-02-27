// Higher-order function that takes a boolean flag and returns a function that either adds or multiplies two numbers
fun mathOperation(addition: Boolean): (Int, Int) -> Int {
    return if (addition) {
        { x, y -> x + y }
    } else {
        { x, y -> x * y }
    }
}

fun main() {
    // Call the higher-order function to get the math operation function for addition
    val add = mathOperation(true)

    // Use the add function to add two numbers and print the result
    val result1 = add(2, 3)
    println("Result of adding 2 and 3: $result1")

    // Call the higher-order function to get the math operation function for multiplication
    val multiply = mathOperation(false)

    // Use the multiply function to multiply two numbers and print the result
    val result2 = multiply(2, 3)
    println("Result of multiplying 2 and 3: $result2")
}
