//Imagine there are three boys in a sports class.
//You need to write a program that checks if the boys are arranged in ascending or descending order by height.
// The program should read three integer numbers h1, h2, h3 and output true or false.
// If the boys have the same height, they are arranged correctly.
fun main() {
    // put your code here
    val h1 = readln().toInt()
    val h2 = readln().toInt()
    val h3 = readln().toInt()
    println(h1 >= h2 && h2 >= h3 || h1 <= h2 && h2 <= h3)
}