fun main() {
    val nums = List(readLine()!!.toInt()) { readLine()!!.toInt() }
    print(nums[nums.lastIndex])
    for (i in 0 until nums.lastIndex) {
        print(" ${nums[i]}")
    }
}
