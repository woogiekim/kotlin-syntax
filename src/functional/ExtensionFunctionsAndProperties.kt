package functional

data class Item(val name: String, val price: Float)

data class Order(val items: Collection<Item>)

fun Order.maxPricedItemValue(): Float = this.items.maxByOrNull { it.price }?.price ?: 0F
fun Order.maxPricedItemName() = this.items.maxByOrNull { it.price }?.name ?: 0F

val Order.commaDelimitedItemNames: String
    get() = items.map { it.name }.joinToString()

fun <T> T?.nullSafeToString() = this?.toString() ?: "NULL"

fun main() {
    val order = Order(listOf(Item("Bread", 25.0F), Item("Wine", 29.0F), Item("Water", 12.0F)))

    println("Max priced item name: ${order.maxPricedItemName()}")
    println("Max priced item value: ${order.maxPricedItemValue()}")
    println("Items: ${order.commaDelimitedItemNames}")

    var nullableOrder: Order? = null

    println(order.nullSafeToString())
    println(nullableOrder.nullSafeToString())

    nullableOrder = order.copy()
    println(nullableOrder.nullSafeToString())

    val replicaOrder = order

    println(order == nullableOrder)
    println(order === nullableOrder)
    println(order === replicaOrder)
}

