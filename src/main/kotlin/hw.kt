fun main()
{
    var list= mutableListOf<Int>()
    println("Enter a number")
    var x= readLine()?.toInt()
    for(i in 1..3)

    {

        if(x!=null)
        {
            list.add(x)
        }
    }
    var fib=0
    for(item in list)
    {
        fib+=item
    }
    println(fib)
}
