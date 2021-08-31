fun main() {
   print(isInRage())
}

fun isInRage(): Boolean {
    val num1: Int = readInt()
    val num2: Int = readInt()
    val num3: Int = readInt()

    return num1 in num2..num3
}

fun readInt() = readLine()!!.toInt()
