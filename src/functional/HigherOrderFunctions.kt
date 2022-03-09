package functional

fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {
    return operation(x, y)
}

fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int, operation2: (Int) -> Int): Int {
    return operation2(operation(x, y))
}

fun sum(x: Int, y: Int) = x + y

// ---

fun operation(): (Int) -> Int {
    return ::square
}

fun square(x: Int) = x * x

fun main() {
    val sumResult = calculate(4, 5, ::sum)
    val mulResult = calculate(4, 5) { a, b -> a * b }
    println("sumResult $sumResult, mulResult $mulResult")

    val sumAndResult = calculate(4, 5, ::sum) { a -> a * 10 }
    val mulAndResult = calculate(4, 5, { a, b -> a * b }, { a -> a * 10 })
    println("sumAndResult $sumAndResult, mulAndResult $mulAndResult")

    val func = operation()
    println(func(2))
}