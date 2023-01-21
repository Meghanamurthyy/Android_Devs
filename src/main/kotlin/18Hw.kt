fun main()
{
    val sum=alternatingSum(1,2,3,4,5,6,7,8)
    println("Alternating sum is $sum")

}
fun alternatingSum(vararg numbers:Int):Int{
    var sum=0
    var toggle=true
    for(i in numbers)
    {
        if(toggle)
        {
            sum+=i
        }
        else
        {
            sum-=i
        }
        toggle=!toggle
    }
    return sum
}