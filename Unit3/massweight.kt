fun main() {
  
    println("Enter the object's mass in kilograms:")
    val mass = readLine()?.toDoubleOrNull() ?: 0.0
   
    val weight = mass * 9.8

    when {
        weight > 1000 -> println("The object is too heavy.")
        weight < 10 -> println("The object is too light.")
        else -> println("The object weighs $weight Newtons.")
    }
}
