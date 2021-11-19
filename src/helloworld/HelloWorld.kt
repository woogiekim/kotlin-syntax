package helloworld

class Application {
    fun main(args: Array<String>) {
        println("hello, world")
    }
}

fun main() {
    printMessageWithPrefix("테스트 ㅎㅎㅎ")
    printMessageWithPrefix("테스트 ㅎㅎㅎ", "DEBUG")
    printMessageWithPrefix(prefix = "테스트 ㅎㅎㅎ", message = "DEBUG")

    println(sum(1, 2))
    println(multiply(2, 4))
}

fun multiply(x: Int, y: Int) = x * y

fun sum(x: Int, y: Int): Int {
    return x + y
}

fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

