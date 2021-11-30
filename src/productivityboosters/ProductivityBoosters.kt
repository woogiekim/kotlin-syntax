package productivityboosters

import java.time.LocalDate
import java.time.chrono.ChronoLocalDate

//Named Arguments
fun format(userName: String, domain: String) = "$userName@$domain"

//String Templates
val greeting = "Kotliner"

//Destructuring Declarations
fun findMinMax(list: List<Int>): Pair<Int, Int> {
    return Pair(50, 100)
}

data class User(val username: String, val email: String)

fun getUser(): User = User("Mary", "mary@somewhere.com")

class Pair<K, V>(val first: K, val second: V) {
    operator fun component1(): K {
        return first
    }

    operator fun component2(): V {
        return second
    }
}

//Smart Casts
val date: ChronoLocalDate? = LocalDate.now()

fun main() {
    println("=== Named Arguments ===")
    println(format("mario", "example.com"))
    println(format("domain.com", "username"))
    println(format(userName = "foo", domain = "bar.com"))
    println(format(domain = "frog.com", userName = "pepe"))
    println()

    println("=== String Templates ===")
    println("Hello $greeting")
    println("Hello ${greeting.uppercase()}")
    println()

    println("=== Destructuring Declarations ===")
    val (x, y, z) = arrayOf(5, 10, 15)
    println("x = $x, y = $y, z = $z")

    val map = mapOf("Alice" to 21, "Bob" to 25)
    for ((name, age) in map) {
        println("$name is $age years old")
    }

    val (min, max) = findMinMax(listOf(100, 90, 50, 98, 76, 83))
    println("min = $min, max = $max")
    println()

    val user = getUser()
    val (username, email) = user
    println(username == user.component1())
    println("email = $email")

    val (_, emailAddress) = getUser()
    println("emailAddress = $emailAddress")
    println()

    val (num, name) = Pair(1, "one")
    println("num = $num, name = $name")
    println()

    println("=== Smart Casts ===")
    if (date != null) {
        println(date.isLeapYear)
    }

    if (date != null && date.isLeapYear) {
        println("It's a leap year!")
    }

    if (date == null || !date.isLeapYear) {
        println("There's no Feb 29 this year...")
    }

    if (date is LocalDate) {
        val month = date.monthValue
        println(month)
    }
}