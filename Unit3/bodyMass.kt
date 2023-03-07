fun main() {
  
    println("Enter your weight in pounds:")
    val weight = readLine()?.toDoubleOrNull() ?: 0.0
    
    println("Enter your height in inches:")
    val height = readLine()?.toDoubleOrNull() ?: 0.0
   
    val bmi = weight * 703 / (height * height)
  
    val status = when {
        bmi < 18.5 -> "underweight"
        bmi > 25 -> "overweight"
        else -> "optimal weight"
    }
    
    println("Your BMI is $bmi, which is $status.")
}
