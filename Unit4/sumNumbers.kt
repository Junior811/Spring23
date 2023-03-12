fun main() {
    var sum = 0 // initialize sum variable to zero
    print("Enter a positive nonzero integer: ")
    val n = readLine()!!.toInt() // read user input and convert to integer
    
    // loop through all numbers from 1 to n and add to sum
    for (i in 1..n) {
        sum += i
    }
    
    println("The sum of all integers from 1 to $n is $sum")
}
