//Write a program that reads one word and prints it as many times as there are letters in it
fun main() {
    // write your code here
    println("Enter a string: ")
    val str = readln()
    val c = str.length
    println("$c repetitions of the word $str: ${str.repeat(c)}")
}