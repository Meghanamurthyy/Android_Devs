fun main()
{
    val list= listOf(1,2,3,4,5)
    println("Product of list $list is ${list.product()}")
}
fun List<Int>.product():Int
{
    var res=1
    for(i in this)
    {
        res*=i
    }
    return res
}