fun main()
{
    println("Enter text(which contains dots)")
    val originalText = readln()
    val out = originalText.filter { it!='.' }
    println(out)
}