fun main() {
    
    val restaurants = mapOf(
        "Joe's Gourmet Burgers" to Triple(false, false, false),
        "Main Street Pizza Company" to Triple(true, false, true),
        "Corner Cafe" to Triple(true, true, true),
        "Mama's Fine Italian" to Triple(true, false, false),
        "The Chef's Kitchen" to Triple(true, true, true)
    )

    print("Is anyone in your party a vegetarian? ")
    val isVegetarian = readLine()?.equals("yes", ignoreCase = true) ?: false

    print("Is anyone in your party a vegan? ")
    val isVegan = readLine()?.equals("yes", ignoreCase = true) ?: false

    print("Is anyone in your party gluten-free? ")
    val isGlutenFree = readLine()?.equals("yes", ignoreCase = true) ?: false

    val allowedRestaurants = restaurants.filter { restaurant ->
        val (vegetarian, vegan, glutenFree) = restaurant.value
        (!isVegetarian || vegetarian) && (!isVegan || vegan) && (!isGlutenFree || glutenFree)
    }.keys

    println("\nHere are your restaurant choices:")
    if (allowedRestaurants.isNotEmpty()) {
        allowedRestaurants.forEach { println(it) }
    } else {
        println("Sorry, there are no restaurants that meet your dietary restrictions.")
    }
}
