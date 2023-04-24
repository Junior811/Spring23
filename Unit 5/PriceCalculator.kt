fun main() {
   
    print("Enter the item's wholesale cost: ")
    
    // If the conversion fails, assign a default value of 0.0 to cost
    val cost = readLine()?.toDoubleOrNull() ?: 0.0
    
    // Prompt the user to enter the markup percentage
    print("Enter the markup percentage: ")
    // Read the user's input as a string, and converts it to a Double 
    
    // If it fails, it will assign a default value of 0.0 to markup
    val markup = readLine()?.toDoubleOrNull() ?: 0.0

    // Call the calculateRetail function to calculate the retail price
    val retailPrice = calculateRetail(cost, markup)

    // Display the calculated retail price to the user
    println("The item's retail price is: \$$retailPrice")
}


fun calculateRetail(wholesaleCost: Double, markupPercentage: Double): Double {
    // Calculate the retail price using the formula: retail price = wholesale cost * (1 + markup percentage)
    val retailPrice = wholesaleCost * (1 + markupPercentage / 100)
    // Return the calculated retail price
    return retailPrice
}
