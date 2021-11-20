package Inheritance

open class Lion(val name: String, val origin: String) {
    fun sayHello() {
        println("$name, the lion from $origin says: graoh!")
    }
}

class Asiatic(name: String) : Lion(name = name, origin = "India")

fun main() {
    val asiatic = Asiatic("Rufo")
    asiatic.sayHello()

    val lion = Lion(name = "Simba", origin = "Korea")
    lion.sayHello()
}
