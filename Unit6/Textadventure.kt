fun main() {
    var currentRoom = "dusty castle room" // Initialize the current room as "dusty castle room"

    while (true) {
        when (currentRoom) {
            "dusty castle room" -> {
                println("You are in a dusty castle room.")
                println("Passages lead to the north and south.")
                print("What direction? ")
                val direction = readLine()?.trim()?.toLowerCase() // Read user input for the direction
                if (direction == "n") {
                    currentRoom = "armory" // Move to the "armory" room if the direction is north
                } else if (direction == "s") {
                    currentRoom = "torch-lit hallway" // Move to the "torch-lit hallway" room if the direction is south
                }
            }
            "armory" -> {
                println("You are in the armory.")
                println("There is a room off to the south.")
                print("What direction? ")
                val direction = readLine()?.trim()?.toLowerCase()
                if (direction == "s") {
                    currentRoom = "dusty castle room" // Move back to the "dusty castle room" if the direction is south
                }
            }
            "torch-lit hallway" -> {
                println("You are in a torch-lit hallway.")
                println("There are rooms to the east and west.")
                print("What direction? ")
                val direction = readLine()?.trim()?.toLowerCase()
                if (direction == "e") {
                    currentRoom = "bedroom" // Move to the "bedroom" if the direction is east
                } else if (direction == "w") {
                    currentRoom = "kitchen" // Move to the "kitchen" if the direction is west
                }
            }
            "bedroom" -> {
                println("You are in a bedroom. A window overlooks the castle courtyard.")
                println("A hallway is to the west.")
                print("What direction? ")
                val direction = readLine()?.trim()?.toLowerCase()
                if (direction == "w") {
                    currentRoom = "torch-lit hallway" // Move back to the "torch-lit hallway" if the direction is west
                }
            }
            "kitchen" -> {
                println("You are in the kitchen. It looks like a roast is being made for supper.")
                println("A hallway is to the east.")
                print("What direction? ")
                val direction = readLine()?.trim()?.toLowerCase()
                if (direction == "e") {
                    println("Can't go that way.") // Notify the user that they can't go in that direction
                } else if (direction == "w") {
                    currentRoom = "torch-lit hallway" // Move back to the "torch-lit hallway" if the direction is west
                }
            }
            else -> {
                println("Invalid room.")
                break // Exit the loop if an invalid room is encountered
            }
        }
    }
}
Luis Ledezma
05/10/23
