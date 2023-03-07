fun main() {
    print("Enter a number between 1 and 10: ")
    val number = readLine()?.toIntOrNull()

    if (number != null && number in 1..10) {
        when (number) {
            1 -> println("I")
            2 -> println("II")
            3 -> println("III")
            4 -> println("IV")
            5 -> println("V")
            6 -> println("VI")
            7 -> println("VII")
            8 -> println("VIII")
            9 -> println("IX")
            10 -> println("X")
        }
    } else {
        println("Error: please enter a number between 1 and 10.")
    }
}
