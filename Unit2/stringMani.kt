fun main() {
    print("Enter the name of your favorite city: ")
    val favoriteCity = readLine()

    println("The city name has ${favoriteCity?.length} characters")

    println("Uppercase: ${favoriteCity?.toUpperCase()}")

    println("Lowercase: ${favoriteCity?.toLowerCase()}")

    println("The first character is ${favoriteCity?.get(0)}")
}
