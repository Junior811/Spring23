fun main() {
    val caloriesPerCookie = 75
    println("Enter the number of cookies you ate:")
    val numCookies = readLine()?.toIntOrNull()

    if (numCookies == null || numCookies < 0) {
        println("Invalid input. Please enter a positive integer.")
        return
    }

    val totalCalories = numCookies * caloriesPerCookie
    println("You consumed $totalCalories calories.")
}i
