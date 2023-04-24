fun calculateProfitOrLoss(
    ns: Int,
    pp: Double,
    pc: Double,
    sp: Double,
    sc: Double
): Double {
    val profit = ((ns * sp) - sc) - ((ns * pp) + pc)
    return profit
}

fun main() {
    // Get input from the user
    print("Enter number of shares: ")
    val ns = readLine()!!.toInt()

    print("Enter purchase price per share: ")
    val pp = readLine()!!.toDouble()

    print("Enter purchase commission paid: ")
    val pc = readLine()!!.toDouble()

    print("Enter sale price per share: ")
    val sp = readLine()!!.toDouble()

    print("Enter sale commission paid: ")
    val sc = readLine()!!.toDouble()

    // Calculate the profit or loss using the calculateProfitOrLoss function
    val profitOrLoss = calculateProfitOrLoss(ns, pp, pc, sp, sc)

    // Display the profit or loss to the user
    if (profitOrLoss >= 0) {
        println("The sale resulted in a profit of $profitOrLoss.")
    } else {
        println("The sale resulted in a loss of ${-profitOrLoss}.")
    }
}
