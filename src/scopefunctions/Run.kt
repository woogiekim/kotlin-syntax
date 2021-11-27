package scopefunctions

fun main() {
    fun getNullableLength(ns: String?) {
        println("for \"$ns\":")
        val length = ns?.run {
            println("\tis empty? ${isEmpty()}")
            length
        }
        println("\tlength = $length")
    }
    getNullableLength(null)
    getNullableLength("")
    getNullableLength("some string with Kotlin")
}