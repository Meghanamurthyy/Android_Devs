fun main()
{
    var OddSum=0
    var EvenSum=0
    println("Enter number")
    val num= readLine()?.toInt()!!
    for(i in 0..num)
    {
        if(i%2==0)
        {
            EvenSum+=i
        }
        else
        {
            OddSum+=i
        }
    }
    println("Odd sum is $OddSum")
    println("Even sum is $EvenSum")
}