fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val result = numbers.map(fun(num): String {
        if (num == 3) {
            return "three" // local return from anonymous function
        } else {
            return "number $num" // local return from anonymous function
        }
    })
    println(result)
}
/*
In this example, we use an anonymous function as the lambda passed to the map function.
Inside the anonymous function, we check if the current number is equal to 3. If it is,
we return the string "three" from the anonymous function using the return keyword.
If it's not, we return a string that includes the number itself from the anonymous function also using the return keyword.
*/