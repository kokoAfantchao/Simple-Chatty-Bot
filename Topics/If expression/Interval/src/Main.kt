fun main() {
    val number = readLine()!!.toInt()
    print(if (-15 < number && number <= 12 || 14 < number && number < 17 || 19 <= number) "True"  else  "False")

}
