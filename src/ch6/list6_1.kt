package ch6

fun strLenSafe(s: String?) : Int =
        if(s != null) s.length else 0

fun printAllCaps(s: String?) {
    val allCaps: String? = s?.toUpperCase()
    println(allCaps)
}


fun main() {
    val x : String? = null
    println(strLenSafe(x))
    println(strLenSafe("abc"))

    printAllCaps("abc")
    printAllCaps(null)
}