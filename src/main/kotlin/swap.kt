fun main()
{
    swap(3,4)

}
fun swap(a:Int,b:Int)
{
    println("Values of number after swapping $a and $b")
    var x=a
    var y=b
    val temp=x
    x=y
    y=temp
    println("Values of number after swapping $x and $y")
}