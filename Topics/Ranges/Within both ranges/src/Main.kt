fun main() {
    print(isInRage())
}

fun isInRage(): Boolean {
    val num1: Int = readInt()
    val num2: Int = readInt()
    val num3: Int = readInt()
    val num4: Int = readInt()
    val num5: Int = readInt()
    return num5 in num1..num2 && num5 in num3..num4
}

fun readInt() = readLine()!!.toInt()