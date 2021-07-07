class WhenExpr {
}
fun describe(obj: Any): String =
    when(obj){
        1       -> "one"
        "Hello" -> "Greeting"
        is Long -> "Long no"
        !is String -> "Not a string"
        else       -> "i don't know"
    }

fun main() {
    println(describe(1))
    println(describe("Hello"))
    println(describe(1000L))
    println(describe(2))
    println(describe("other"))
}