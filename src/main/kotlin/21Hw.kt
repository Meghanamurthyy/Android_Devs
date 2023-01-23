fun main()
{
    val list= listOf(1,2,3,4,5)
    val array= arrayOf(1,2,3,4,5,6,7)
    println("List:$list")
    println("Array:$array")
    printalterantive(array)
    printalterantive(list)

}
fun printalterantive(list:List<Int>)
{
    var i=0
    var j=list.size-1
    var toggle=true
    while(i<=j)
    {
        if(toggle)
        {
            println(list[i])
            i++
        }
        else
        {
            println(list[j])
            j--
        }
        toggle = !toggle
    }
}
fun  printalterantive(array: Array<Int>)
{
    var i=0
    var j=array.size-1
    var toggle=true
    while(i<=j)
    {
        if(toggle)
        {
            println(array[i])
            i++
        }
        else
        {
            println(array[j])
            j--
        }
        toggle = !toggle
    }

}
