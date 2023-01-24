//Write a program that reads a list of integers and finds the index of the first maximum in the list.
fun main() {
    // write your code here
    val size = readln().toInt()
    val list = MutableList(size){readln().toInt()}
    val max=list.maxOrNull()
    println(list.indexOf(max))
}
