package functions

import java.util.stream.Collectors

fun main() {
    infix fun Int.times(str: String) = str.repeat(this)
    println(2 times "Bye ")

    val pair = "Ferrari" to "Katrina"
    println(pair)

    infix fun String.onto(other: String) = Pair(this + "_custom", other)
    val myPair = "McLaren" onto "Lucas"
    println(myPair)

    val sophia = Person("sophia")
    val claudia = Person("claudia")
    val chars = Person("chars")
    sophia likes claudia
    sophia likes chars

    claudia likes sophia

    sophia.printLikedPeople()
    claudia.printLikedPeople()
}

class Person(val name: String) {
    val likedPeople = mutableListOf<Person>()
    infix fun likes(other: Person) {
        likedPeople.add(other)
    }

    fun printLikedPeople() {
        println("likedPeople = ${likedPeople.stream().map(Person::name).collect(Collectors.joining(", "))}")
    }

    override fun toString(): String {
        return "functions.Person(name=$name, likedPeople=${likedPeople})"
    }
}