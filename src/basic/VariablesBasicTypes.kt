package basic

fun main(args: Array<String>) {
    /******************************************
    Numbers
     *****************************************/
    // int
    var int = 123
    println(int)

    // long
    var long = 3112312312L
    println(long)

    // double
    var double = 1.2
    println(double)

    // float
    var float = 2.1F
    println(float)

    // hexadecimal
    var hexadecimal = 0xAB
    println(hexadecimal)

    // binary
    var binary = 0b01010111
    println(binary)


    /******************************************
    Booleans
     *****************************************/
    var isTrue = true
    println(isTrue)

    var checkEquals = 2 == 2
    println(checkEquals)


    /******************************************
    Chars
     *****************************************/
    // Single caraceter
    var char = "A"
    println(char)


    /******************************************
    Strings
     *****************************************/
    var string = "String line"
    println(string)

    var newString = "String \n new line"
    println(newString)


    /******************************************
    Basic Arrays
     *****************************************/
    var array = arrayOf(1,2,3,4)

    val arrayExample = Array(3, { k -> k * k })
}