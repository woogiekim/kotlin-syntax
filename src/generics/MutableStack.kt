package generics

fun main() {
    val mutableStack = MutableStack<Any>()

    mutableStack.push("test")
    mutableStack.push(1)
    mutableStack.push(0.1)

    println("mutableStack = $mutableStack")

    val any = mutableStack.pop()

    println("any = $any")
    println("mutableStack = $mutableStack")
}

class MutableStack<E>(vararg items: E) {
    private val elements = items.toMutableList()

    fun push(element: E) = elements.add(element)

    fun peek(): E = elements.last()

    fun pop(): E = elements.removeAt(elements.lastIndex)

    fun isEmpty(): Boolean = elements.isEmpty()

    fun size() = elements.size

    override fun toString() = "MutableStack(elements=${elements.joinToString()})"
}