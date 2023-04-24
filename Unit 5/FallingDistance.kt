fun fallingDistance(t: Double): Double {
    // Acceleration due to gravity in m/s^2
    val g = 9.8

    // Calculate the distance in meters using the formula
    val d = 0.5 * g * (t * t)

    // Return the distance
    return d
}
fun main() {
    for (i in 1..10) {
        val distance = fallingDistance(i.toDouble())
        println("Time: $i s - Distance fallen: $distance m")
    }
}
