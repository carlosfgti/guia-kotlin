package basic

fun main(args: Array<String>) {
    firstFunction()

    println(functionWithReturn())

    println(functionWithParam("Some"))

    println(newExample("Teste"))
}

fun firstFunction () {
    println("First Function")
}

fun functionWithReturn (): String {
    return "String return"
}

fun functionWithParam (value: String): String {
    return "String param $value"
}

fun newExample (newValue: String): String {
    return functionWithParam("--$newValue--")
}