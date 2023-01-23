fun main()
{
    println("Enter value to be searched")
    val input= readLine()?.toInt()
    if(input!=null)
    {
        println("$input found at index ${search(1,2,3,4,5,66,6, value = input)}")
    }

}
fun search(vararg numbers:Int,value:Int):Int
{
    for(i in 0..numbers.size-1)
    {
        if(numbers[i]==value)
        {
            return i
        }
    }
    return -1

}