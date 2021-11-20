package Inheritance

open class Tiger(val origin: String) {
    fun sayHello() {
        println("A tiger from $origin says: grrhhh!")
    }
}

class SiberianTiger : Tiger("Siberia")

fun main() {
    val siberianTiger = SiberianTiger()
    siberianTiger.sayHello()

    val tiger = Tiger("origin")
    tiger.sayHello()
}