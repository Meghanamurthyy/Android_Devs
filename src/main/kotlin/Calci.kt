fun main()
{
    println("Enter the choice: 1.Addition 2.Subtraction 3.Multiplication 4.Division 5.Exit")
    val ch= readLine()?.toInt()!!
    println("Enter two numbers for operation")
    val a= readLine()?.toDouble()!!
    val b= readLine()?.toDouble()!!
    when (ch) {
        1 -> println("Result after addition is ${a + b}")
        2 -> println("Result after subtraction is ${a - b}")
        3 -> println("Result after multiplication is ${a * b}")
        4 -> println("Result after division is ${a / b}")

    }
}
