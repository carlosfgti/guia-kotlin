package basic

fun main(args: Array<String>) {
    var count = 2
    var age = 50

    when (count) {
        1 -> println("Equals 1")
        2 -> println("Equals 2")
        3 -> println("Equals 3")
        else -> {
            println("Not defined")
        }
    }

    when (age) {
        in 1..11 -> println("Children")
        in 12..17 -> println("Teenager")
        in 18..60 -> println("Adult")
        in 61..100 -> println("Old man")
        else -> println("Not defined")
    }
}