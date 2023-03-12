fun main() {
    
    print("Enter the starting number of organisms (must be at least 2): ")
    var numOrgs = readLine()!!.toInt()
    while (numOrgs < 2) {
        print("Invalid input. Enter the starting number of organisms (must be at least 2): ")
        numOrgs = readLine()!!.toInt()
    }
    
    print("Enter the average daily population increase as a percentage (must be positive): ")
    var dailyIncrease = readLine()!!.toDouble()
    while (dailyIncrease < 0) {
        print("Invalid input. Enter the average daily population increase as a percentage (must be positive): ")
        dailyIncrease = readLine()!!.toDouble()
    }
    
    print("Enter the number of days they will multiply (must be at least 1): ")
    var numDays = readLine()!!.toInt()
    while (numDays < 1) {
        print("Invalid input. Enter the number of days they will multiply (must be at least 1): ")
        numDays = readLine()!!.toInt()
    }

    var population = numOrgs.toDouble()
    for (day in 1..numDays) {
        println("Day $day: Population size is ${population.toInt()}")
        population += population * dailyIncrease / 100
    }
}
