package functions

fun main() {
    printAll("Hello", "Hallo", "Salut", "Hola", "안녕")
    printAllWithPrefix(
        "Hello", "Hallo", "Salut", "Hola", "안녕",
        prefix = "Greeting: "
    )

    log("Hello", "Hallo", "Salut", "Hola", "안녕")
}

fun printAll(vararg messages: String) {
    for (message in messages) {
        println(message)
    }
}

fun printAllWithPrefix(vararg messages: String, prefix: String) {
    for (message in messages) {
        println(prefix + message)
    }
}

fun log(vararg entries: String) {
    printAll(*entries)
}