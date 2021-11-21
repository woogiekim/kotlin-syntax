package functions

fun main() {
    println(2 * "Bye")

    val str = "Always forgive your enemies; nothing annoys them so much."
    println(str[0..5])

    println("Hi, there I'm Groot!!!" / IntRange(14, 21))
}

operator fun Int.times(str: String) = str.repeat(this)

operator fun String.get(range: IntRange) = substring(range)


operator fun String.div(range: IntRange) = substring(range)
