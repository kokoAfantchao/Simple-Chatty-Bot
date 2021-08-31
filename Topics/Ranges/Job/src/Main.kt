fun main() {
    print(canHaveJob()) 
}
fun canHaveJob(): Boolean {
    val age = readLine()!!.toInt()    
    return age in 18..59
}
