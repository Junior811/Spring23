fun main() {
   
    println("Enter three names:")
    val name1 = readLine()
    val name2 = readLine()
    val name3 = readLine()

    val names = listOfNotNull(name1, name2, name3)

    val sortedNames = names.sorted()

    println("Sorted names in ascending order:")
    sortedNames.forEach { println(it) }
}
