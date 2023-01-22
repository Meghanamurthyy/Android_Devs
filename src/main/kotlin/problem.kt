//Write a program that reads a, b, and n and outputs how many numbers in the inclusive range from a to b (a < b) are divisible by n.
fun main()
{
    val a = readln().toInt()
    val b = readln().toInt()
    val n = readln().toInt()
    var count=0
    for(i in a..b)
    {
        if(i % n ==0)
            count++
    }
    println(count)
}