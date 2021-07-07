class Ranges {
}
val x = 10
val y = 11
val list = listOf("a","b","c")
fun main() {
    for(x in 9 downTo 0 step 3)
        println(x)
    for (x in 1..10 step 3)
        println(x)
    for (x in 1..5)
        println(x)

    if(-1 !in 0..list.lastIndex)
        println("-1 is out of range")
    if (y in 1..10)
        println("fits in the range")
    else
        println("out of range")
}