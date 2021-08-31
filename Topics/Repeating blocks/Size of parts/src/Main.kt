fun main() {
    // put your code here
    val numberOfPartes = readLine()!!.toInt()
    var larger = 0
    var smaller = 0
    var perfect = 0

    repeat(numberOfPartes) {
        val number = readLine()!!.toInt()
        if (number == 1) {
            larger++
        } else if (number == -1) {
            smaller++
        } else {
            perfect++
        }
    }
    print("$perfect $larger $smaller")
}