package variables

fun main() {
    var a: String = "initial"
    println(a)

    a = "change"
    println(a)

    val b: Int = 1
    println(b)

//    b = 23 compile error

    val c = 3
    println(c)

    var e: Int

    val d: Int

    if (someCondition()) {
        d = 1
    } else {
        d = 2
    }

    println(d)
}

fun someCondition(): Boolean = false
