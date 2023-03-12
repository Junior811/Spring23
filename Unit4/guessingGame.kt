fun main() {
    val random = (1..100).random() 
    var guess: Int? 

    do {
        print("Guess the number between 1 and 100: ")
        guess = readLine()?.toIntOrNull()

        when {
            guess == null -> println("Invalid input, please enter a number.")
            guess < random -> println("Too low, try again.")
            guess > random -> println("Too high, try again.")
        }
    } while (guess != random)

    println("Congratulations! You guessed the number $random.")
}
