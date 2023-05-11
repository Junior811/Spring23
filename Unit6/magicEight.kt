import kotlin.random.Random

fun main() {
    val responses = arrayOf(
        "It is certain",
        "Without a doubt",
        "You may rely on it",
        "Yes, definitely",
        "It is decidedly so",
        "As I see it, yes",
        "Most likely",
        "Outlook good",
        "Yes",
        "Signs point to yes"
    )

    val random = Random
    var playAgain = true

    while (playAgain) {
        println("Ask a yes or no question:")
        val question = readLine()?.trim()

        val randomIndex = random.nextInt(responses.size)
        val response = responses[randomIndex]
        println("Magic 8 Ball says: $response")

        println("Do you want to ask another question? (yes/no)")
        val playAgainInput = readLine()?.trim()?.toLowerCase()

        playAgain = when (playAgainInput) {
            "yes" -> true
            "no" -> false
            else -> false
        }
    }

    println("Goodbye!")
}
