fun main() {
    val random = (1..100).random() 
    var guess: Int? 
    var count = 0 

    do {
        print("Guess the number between 1 and 100: ")
        guess = readLine()?.toIntOrNull()

        when {
            guess == null -> println("Invalid input, please enter a number.")
            guess < random -> {
                println("Too low, try again.")
                count++
            }
            guess > random -> {
                println("Too high, try again.")
                count++
            }
        }
    } while (guess != random)

    count++ // count the correct guess
    println("Congratulations! You guessed the number $random in $count guesses.")
}
