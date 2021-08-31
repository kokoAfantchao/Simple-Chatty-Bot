fun main() {
    // write your code here
    val n = readLine()!!.toInt()
    if (n == 1) {
        print(readLine()!!.toInt())
    } else {
        val c = Array<Int>(n) { readLine()!!.toInt() }
        c.sort()
        print(c.get(n - 2) * c.get(n - 1))
    }
}

