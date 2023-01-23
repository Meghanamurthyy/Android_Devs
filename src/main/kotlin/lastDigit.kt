fun main() {
    println("Enter a number:")
    val a = readLine()!!.toInt()
    println(getLastDigit(a))
}
fun getLastDigit(a:Int):Int
{
    if(a>0)
        return a%10
    else
        return -a%10
}