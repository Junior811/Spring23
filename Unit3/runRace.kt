fun main() {
    
    println("Enter the name and time (in minutes) of Runner 1:")
    val (name1, time1) = readLine()!!.split(" ")
    println("Enter the name and time (in minutes) of Runner 2:")
    val (name2, time2) = readLine()!!.split(" ")
    println("Enter the name and time (in minutes) of Runner 3:")
    val (name3, time3) = readLine()!!.split(" ")

    val first: String
    val second: String
    val third: String

    if (time1 < time2 && time1 < time3) {
        first = name1
        if (time2 < time3) {
            second = name2
            third = name3
        } else {
            second = name3
            third = name2
        }
    } else if (time2 < time1 && time2 < time3) {
        first = name2
        if (time1 < time3) {
            second = name1
            third = name3
        } else {
            second = name3
            third = name1
        }
    } else {
        first = name3
        if (time1 < time2) {
            second = name1
            third = name2
        } else {
            second = name2
            third = name1
        }
    }

    println("Runners in the order they finished:")
    println("1. $first")
    println("2. $second")
    println("3. $third")
}
