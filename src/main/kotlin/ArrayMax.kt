fun main() {
    println("Enter size")
    val num = readLine()?.toInt()!!
    println("Enter elements of array")
    val array = Array<Int>(num) { readLine()?.toInt()!! }
    var max = 0
    for (i in array) {
        if (i > max) {
            max = i
        }
    }
    println("Max is $max")
}