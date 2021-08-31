fun main() {
    // write your code here
    val n = readLine()!!.toInt()
    var min = Int.MAX_VALUE
    repeat(n) {
        val c = readLine()!!.toInt()
        min = if (c < min) c else min
    }
    print(min)
}