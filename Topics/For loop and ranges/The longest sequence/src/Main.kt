var overAllMax = 0;
fun main() {
    val n = readLine()!!.toInt()
    var arr = Array<Int>(n) { readLine()!!.toInt() }
    if (n == 1) {
        print(1)
    } else {
        helper(arr, n)
        print(overAllMax)
    }
}

fun helper(arr: Array<Int>, n: Int): Int {
    if (n == 1) return 1;
    var maxendingHere = 0

    for (i in 1 until n) {
        var res = helper(arr, i)
        if (arr[n - 1] > arr[i - 1] && maxendingHere < res + 1) {
            maxendingHere = res + 1
        }
    }
    if (maxendingHere > overAllMax) overAllMax = maxendingHere
    return maxendingHere;
}