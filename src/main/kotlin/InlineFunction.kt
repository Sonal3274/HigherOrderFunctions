inline fun calculateTimeAndRun(fn: () -> Unit) {
    val startTime = System.currentTimeMillis()
    fn()
    val endTime = System.currentTimeMillis()
    println("Time taken: ${endTime - startTime}ms")
}

fun loop (x: Long){
    for (i in 1..x){
        //
    }
}

fun main() {
    calculateTimeAndRun {
        // Perform some time-consuming operation
        loop(1000000)
    }
}
