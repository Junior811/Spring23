fun main() {
    print("Enter the month (in numeric form): ")
    val month = readLine()!!.toInt()

    print("Enter the day: ")
    val day = readLine()!!.toInt()

    print("Enter the two-digit year: ")
    val year = readLine()!!.toInt()

    if (month * day == year) {
        println("The date is magic!")
    } else {
        println("The date is not magic.")
    }
}
