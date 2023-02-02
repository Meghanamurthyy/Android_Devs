fun main() {
    val rows = readln().toInt()

    for (i in rows downTo 1) {
        for (j in 1..i) {
            print("* ")
        }
        println()
    }
}