fun main()
{
    val size = readln().toInt()
    val numbers = Array(size){ readln().toDouble() }
    var sum = 0.0
    for(i in numbers)
    {
        sum+=i
    }
    val avg = sum/size
    println("Average of all the elements in the array is $avg")

}