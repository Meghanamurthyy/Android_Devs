fun main()
{
    val rows = 2
    val column = 3
    val matrix1 = arrayOf(intArrayOf(2,3,4), intArrayOf(5,2,3))
    val matrix2 = arrayOf(intArrayOf(-4,5,3), intArrayOf(5,6,3))
    val sum = Array(rows) { IntArray(column) }
    for(i in 0..rows - 1)
    {
        for(j in 0..column - 1)
        {
            sum[i][j]=matrix1[i][j]+matrix2[i][j]
        }
    }
    println("Sum of matrices are:")
    for(row in sum)
    {
        for(col in row)
        {
            print("$col ")
        }
        println()
    }
}
