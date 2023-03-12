fun main() {
    var sum = 0 
    print("Enter a positive nonzero integer: ")
    val n = readLine()!!.toInt() 
    
    for (i in 1..n) {
        sum += i
    }
    
    println("The sum of all integers from 1 to $n is $sum")
}
