fun main()
{
    println("Enter a number")
    val num = readln().toInt()
    var res=1
    for(i in 2..num)
    {
        res*=i
    }
    println("Factorial of $num is $res")
}