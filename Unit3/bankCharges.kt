fun main() {
   
    val baseFee = 10.0
    var checkFee = 0.0
  
    print("Enter the number of checks written this month: ")
    val numChecks = readLine()?.toIntOrNull() ?: 0

    if (numChecks in 1..19) {
        checkFee = 0.1
    } else if (numChecks in 20..39) {
        checkFee = 0.08
    } else if (numChecks in 40..59) {
        checkFee = 0.06
    } else if (numChecks >= 60) {
        checkFee = 0.04
    }

    val totalFee = baseFee + numChecks * checkFee

    println("The bank's service fee for the month is $${totalFee.format(2)}.")
}
fun Double.format(digits: Int) = "%.${digits}f".format(this)
