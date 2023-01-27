fun main()
{
    upper()
}
fun upper()
{
    println("Enter either upper or lower")
    val input = readln()
    println("Enter the string")
    val str = readln()
    if(input=="upper")
    {

        println(str.uppercase())
    }
    else if(input=="lower")
    {
        println(str.lowercase())
    }

}