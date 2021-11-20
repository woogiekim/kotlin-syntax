package classes

class Customer

class Contact(val id: Int, var email: String) {

    override fun toString(): String {
        return "Contact(id=$id, email='$email')"
    }
}

fun main() {
    val customer = Customer()

    val contact = Contact(1, "mdir2@naver.com")
    println("contact = ${contact}")

    contact.email = "mdir2kor@gmail.com"
    println("contact = ${contact}")

//    contact.id = 2
}