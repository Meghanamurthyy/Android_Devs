fun main() {
    val myInput = 15
    var temp1 = 0
    var temp2 = 1

    println("The number is defined as: $myInput")
    println("The Fibonacci series till $myInput terms:")

    for (i in 1..myInput) {
        print("$temp1 ")

        val sum = temp1 + temp2
        temp1 = temp2
        temp2 = sum
    }
}