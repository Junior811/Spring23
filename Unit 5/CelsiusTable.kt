fun celsius(f: Double): Double {
    // Convert Fahrenheit to Celsius using the formula
    val c = (5.0 / 9.0) * (f - 32.0)

    // Return the Celsius temperature
    return c
}
fun main() {
    println("Fahrenheit        Celsius")
    println("----------------------------")

    // Loop through Fahrenheit temperatures from 0 to 20
    for (f in 0..20) {
        // Convert Fahrenheit to Celsius using the celsius function
        val c = celsius(f.toDouble())

        // Display the Fahrenheit and Celsius temperatures
        println("$f           $c")
    }
}
