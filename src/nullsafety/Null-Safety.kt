package nullsafety

fun main() {
    var neverNull: String = "This can't be null"
//    neverNull = null

    println(strLength(neverNull))

    var nullable: String? = "You can keep a null here"
    nullable = null

//    println(strLength(nullable))

    var inferredNonNull = "The compiler assumes non_null"
//    inferredNonNull = null
}

fun strLength(notNull: String): Int {
    return notNull.length
}