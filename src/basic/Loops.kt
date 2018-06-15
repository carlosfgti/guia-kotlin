package basic

fun main(args: Array<String>) {
    /*********************************************
     * while
     *********************************************/
    println("while")
    var i = 1
    while (i <= 10) {
        println(i)

        i++
    }


    /*********************************************
     * for
     *********************************************/
    println("for")
    var infos = listOf(1,2,3,4)
    for (info in infos) {
        println(info)
    }


    /*********************************************
     * Ranges and loop for
     *********************************************/
    println("Ranges and loop for")
    var fiveToTen = 5..10
    for (n in fiveToTen) {
        println(n)
    }


    /*********************************************
     * Loop Strings + String Template
     *********************************************/
    println("Loop Strings")
    var name = "Carlos Ferreira - EspecializaTi"
    for (n in name) {
        print("$n ")
    }
}