fun fibonacci(number: Int): Int {
    // If the input number is less than 1, return 0
    if (number < 1) {
        return 0
        // If the input number is 1 or 2, return 1 (as per the Fibonacci sequence definition)
    } else if (number == 1 || number == 2) {
        return 1
    }

    // Initialize the previous two Fibonacci numbers
    var prev1 = 1
    var prev2 = 1

    // Loop through the remaining Fibonacci numbers up to the input number
    for (i in 3..number) {
        // Compute the sum of the previous two Fibonacci numbers
        val sum = prev1 + prev2
        // Shift the previous two numbers to the right to prepare for the next iteration
        prev1 = prev2
        prev2 = sum
    }

    // Return the final computed Fibonacci number
    return prev2
}

fun main() {
    print("Enter a number: ")
    val input = readLine()
    val number = input?.toIntOrNull() ?: 0
    val result = fibonacci(number)
    println("The fibonacci number for $number is $result")
}
