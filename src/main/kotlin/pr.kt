//There are N companies in the country. The laws of this country say that the tax of each company is decided by the President.
// The President wants to know which company pays the highest tax.
// However, none of the President's advisers know math well enough, so they asked for your help. Can you solve this problem?
fun main() {
    val comp = readln().toInt()
    val incomes = mutableListOf<Int>()
    val percentage = mutableListOf<Int>()
    for (i in 0 until comp) {
        incomes.add(readln().toInt())
    }
    for (i in incomes) {
        percentage.add(readln().toInt() * i)
    }
    println(percentage.indexOf(percentage.maxOrNull()) + 1)
}