fun main() {
    // put your code here
    val numElement = readLine()!!.toInt()
    var max = Int.MIN_VALUE
    repeat(numElement) {
        val num = readLine()!!.toInt()
        if (num % 4 == 0 && num >= max) {
            max = num
        }
    }
    print(max)
}