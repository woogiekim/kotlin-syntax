package scopefunctions

data class Person(var name: String = "", var age: Int = 0, var about: String = "")

fun main() {
    val jake = Person()
    val stringDescription = jake.apply {
        name = "jake"
        age = 30
        about = "Android developer"
    }.toString()

    println("stringDescription = ${stringDescription}")
}
