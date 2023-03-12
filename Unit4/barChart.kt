fun main() {
    val sales = IntArray(5)
    for (i in 0 until 5) {
        print("Enter today's sales for store ${i+1}: ")
        sales[i] = readLine()!!.toInt()
    }

    println("SALES BAR CHART")
    for (i in 0 until 5) {
        print("Store ${i+1}: ")
        val numAsterisks = sales[i] / 100
        for (j in 1..numAsterisks) {
            print("*")
        }
        println()
    }
}
