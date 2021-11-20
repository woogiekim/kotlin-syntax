package Inheritance

open class Dog {
    open fun sayHello() {
        println("wow wow!")
    }
}

class Yorkshire : Dog() {
    override fun sayHello() {
        println("wif wif!")
    }
}

fun main() {
    val yorkshire: Dog = Yorkshire()
    yorkshire.sayHello()

    val dog = Dog()
    dog.sayHello()
}
