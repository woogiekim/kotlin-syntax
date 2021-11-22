package collections

val numbers = listOf(1, -2, 3, -4, 5, -6)

//filter
val positives = numbers.filter { x -> x > 0 }
val negatives = numbers.filter { it < 0 }

//map
val doubled = numbers.map { x -> x * 2 }
val tripled = numbers.map { it * 3 }

//any
val anyNegative = numbers.any { it < 0 }
val anyGT6 = numbers.any { it > 6 }

//all
val allEven = numbers.all { it % 2 == 0 }
val allLess6 = numbers.all { it < 6 }

//none
val allNonEven = numbers.none { it % 2 == 1 }
val allNonLess6 = numbers.none { it > 6 }

fun main() {
    println("sort:")
    println("numbers ascending: ${numbers.sorted().joinToString()}")
    println("numbers descending: ${numbers.sortedDescending().joinToString()}")
    println()

    //filter
    println("filter:")
    println("positives: ${positives.joinToString()}")
    println("negatives: ${negatives.joinToString()}")
    println()

    //map
    println("map:")
    println("doubled: ${doubled.joinToString()}")
    println("tripled: ${tripled.joinToString()}")
    println()

    //any
    println("any:")
    println("anyNegative: $anyNegative")
    println("anyGT6: $anyGT6")
    println()

    //all
    println("all:")
    println("allEven: $allEven")
    println("allLess6: $allLess6")
    println()

    //all
    println("none:")
    println("allNonEven: $allNonEven")
    println("allNonLess6: $allNonLess6")
    println()
}
