package basic

fun main(args: Array<String>) {
    /******************************************
     * Conversion
     ******************************************/
    var account = 21312

    println(account.toString())
    println(account.toString() is String)

    println("12".toInt() is Int)

    println("12".toIntOrNull())
    println("Eti".toIntOrNull())
    println("Eti".toIntOrNull() ?: 0)

    println("1.2".toDouble() is Double)
    println("1.2".toDouble() is Number)
}