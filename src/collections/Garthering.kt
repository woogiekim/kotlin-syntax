package collections

import kotlin.math.abs

val words = listOf("Lets", "find", "something", "in", "collection", "somehow")

//find, findLast
val findFirst = words.find { it.startsWith("some") }
val findLast = words.findLast { it.startsWith("some") }
val nothing = words.find { it.contains("nothing") }

//first, last
val first = words.first()
val last = words.last()

//count
val totalCount = numbers.count()
val evenCount = numbers.count { it % 2 == 0 }

//associateBy, groupBy
data class Person(val name: String, val city: String, val phone: String)

val people: List<Person> = listOf(
    Person("John", "Boston", "+1-888-123456"),
    Person("Sarah", "Munich", "+49-777-789123"),
    Person("Svyatoslav", "Saint-Petersburg", "+7-999-456789"),
    Person("Vasilisa", "Saint-Petersburg", "+7-999-123456")
)

val phoneBook = people.associateBy { it.phone }
val cityBook = people.associateBy(Person::phone, Person::city)
val peopleCities = people.groupBy(Person::city, Person::name)
val lastPersonCity = people.associateBy(Person::city, Person::name)

//partition
val evenOdd = numbers.partition { it % 2 == 0 }
val partitionPositives = numbers.partition { it > 0 }

//flatMap
val fruitsBag: List<String> = listOf("🍎", "🍊", "🍌", "🍇")
val clothesBag = listOf("shirts", "pants", "jeans")
val cart = listOf(fruitsBag, clothesBag)
val mapBag = cart.map { it }
val flatMapBag = cart.flatMap { it }

//minOrNull, maxOrNull
val empty = emptyList<Int>()
val only = listOf(3)

//sorted
val shuffled = listOf(5, 4, 2, 1, 3, -10)
val natural = shuffled.sorted()
val inverted = shuffled.sortedBy { -it }
val descending = shuffled.sortedDescending()
val descendingBy = shuffled.sortedByDescending { abs(it) }

//Map Element Access
val map = mapOf("key" to 42)

val value1 = map["key"]
val value2 = map["key2"]

val value3: Int = map.getValue("key")

val mapWithDefault = map.withDefault { k -> k.length }
val value4 = mapWithDefault.getValue("key2")

//zip
val A = listOf("a", "b", "c")
val B = listOf(1, 2, 3, 4)

val resultPairs = A zip B
val resultReduce = A.zip(B) { a, b -> "$a$b" }

//getOrElse
val list = listOf(0, 10, 20)

fun main() {
    //find, findLast
    println("find, findLast:")
    println("findFirst = $findFirst")
    println("findLast = $findLast")
    println("nothing = $nothing")
    println()

    //first, last
    println("first, last:")
    println("first = $first")
    println("last = $last")
    println()

    //count
    println("count:")
    println("totalCount = $totalCount")
    println("evenCount = $evenCount")
    println()

    //associateBy, groupBy
    println(phoneBook)
    println(cityBook)
    println(peopleCities)
    println(lastPersonCity)
    println()

    //partition
    println(evenOdd)
    println(partitionPositives)
    println()

    //flatMap
    println(fruitsBag)
    println(mapBag)
    println(flatMapBag)
    println()

    //minOrNull, maxOrNull
    println("Numbers: $numbers, min = ${numbers.min()} max = ${numbers.max()}")
    println("Empty: $empty, min = ${empty.min()}, max = ${empty.max()}")
    println("Only: $only, min = ${only.min()}, max = ${only.max()}")
    println()

    //sorted
    println("natural = ${natural}")
    println("inverted = ${inverted}")
    println("descending = ${descending}")
    println("descendingBy = ${descendingBy}")
    println()

    //Map Element Access
    println("value1 = ${value1}")
    println("value2 = ${value2}")
    println("value3 = ${value3}")
    println("value4 = ${value4}")

    try {
        map.getValue("antoherKey")
    } catch (e: NoSuchElementException) {
        println("Message: $e")
    }
    println()

    //zip
    println("resultPairs = ${resultPairs}")
    println("resultReduce = ${resultReduce}")
    println()

    //getOrElse
    println(list.getOrElse(1) { 42 })
    println(list.getOrElse(10) { 42 })
}