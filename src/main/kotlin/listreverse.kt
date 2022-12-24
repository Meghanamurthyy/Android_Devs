fun main()
{
    var list= mutableListOf<Int>()
    println("Enter 5 numbers:")
    for(i in 1..5)
    {
        val x= readLine()?.toInt()
        if(x!=null)
        {
            list.add(x)
        }
    }
    var c=list.reversed()
    println(c)
}
