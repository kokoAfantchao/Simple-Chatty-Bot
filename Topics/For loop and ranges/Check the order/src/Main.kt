fun main() {
    // write your code here
    val n = readLine()!!.toInt()
    var count = Int.MIN_VALUE
    repeat(n) {
        val temp = readLine()!!.toInt()
        if (count <= temp) {
            count = temp
        } else {
            print("NO")
            return
        }
    }
    print("YES")
}