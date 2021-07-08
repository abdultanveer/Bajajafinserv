 open class Human
class Customer (val id: Int, var Name: String):Human()

fun main() {
    val customer: Customer
    customer = Customer(123,"abdul")
    println(customer.Name)
}