fun main()
{
    println("Enter a number")
    val  num = readln().toInt()
    for(i in 1..10)
    {
       println("$num X $i = ${num*i}")
    }

}