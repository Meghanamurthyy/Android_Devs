fun main()
{
    println("Enter string one")
    val str1 = readln()
    println("Enter string two")
    val c = str1.last()
    val str2 = readln()
    val d = str2.last()
    if(c == d)
    {
        println("both have same last character $c")
    }
    else
    {
        println("Both don't have same last character")
    }

}