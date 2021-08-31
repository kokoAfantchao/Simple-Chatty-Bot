fun main() {
    // put your code here
    val numSequence = readLine()!!.toInt()
    var positives = 0
    repeat(numSequence) {
        val num = readLine()!!.toInt()
        positives += if (num > 0) 1 else 0
    }
    print(positives)
}