fun main() {
    // write your code here
    val number = readLine()!!.toInt()
    var sum = 0
    repeat(number) {
        sum += readLine()!!.toInt()
    }
    print(sum)
}