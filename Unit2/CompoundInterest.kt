import kotlin.math.pow

fun main() {
    print("Enter the principal amount: ")
    val principal: Double = readLine()?.toDouble() ?: 0.0

    print("Enter the annual interest rate: ")
    val annualRate: Double = readLine()?.toDouble() ?: 0.0
    val monthlyRate: Double = annualRate / 12 / 100

    print("Enter the number of times interest is compounded per year: ")
    val n: Int = readLine()?.toInt() ?: 0

    print("Enter the number of years: ")
    val t: Int = readLine()?.toInt() ?: 0

    val amount: Double = principal * (1 + monthlyRate / n).pow(n * t)

    println("After $t years, the amount in the account will be: $$amount")
}
