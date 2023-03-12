fun main() {
    print("Enter a string: ")
    val str = readLine()!!.toString()
    print("Enter a character: ")
    val ch = readLine()!!.toString()[0] 
    
    var count = 0 
    
    for (c in str) {
        if (c == ch) {
            count++ 
        }
    }
    
    println("The character '$ch' appears $count times in the string '$str'")
}
