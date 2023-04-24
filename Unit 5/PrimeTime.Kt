// Define a function that checks if a number is divisible by a given divisor
fun isNumberDivisible(number: Int, divisor: Int): Boolean {
    // Use the modulo operator to check if the remainder of number divided by divisor is zero
    return number % divisor == 0
}

// Define a function that checks if a given number is prime
fun isPrime(number: Int): Boolean {
    // Check if the number is less than or equal to 1, which is not prime
    if (number <= 1) {
        return false
    }

    // Loop through the numbers from 2 to the square root of the number
    for (i in 2..Math.sqrt(number.toDouble()).toInt()) {
        // Check if the current number in the loop divides the number evenly using the isNumberDivisible function
        if (isNumberDivisible(number, i)) {
            // If any number divides the number evenly, it's not prime
            return false
        }
    }

    // If no number divides the number evenly, it's prime
    return true
}

// Define the main function to loop and ask the user to input a number until the input is invalid
fun main() {
    while (true) {
        // Ask the user to input a number
        print("Enter a positive integer (or a non-numeric value to exit): ")
        val input = readLine()

        // Try to convert the input to an integer, or break the loop if it's invalid
        val number = try {
            input?.toInt()
        } catch (e: NumberFormatException) {
            break
        }

        // Check if the input is null or less than or equal to 0, or call the isPrime function to check if it's prime
        if (number == null || number <= 0) {
            println("Invalid input!")
        } else {
            val result = if (isPrime(number)) "is prime" else "is not prime"
            println("$number $result.")
        }
    }
}
