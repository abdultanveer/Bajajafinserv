class Loops {
}
val items = listOf("apple","mango","banana")

fun main() {
    for(item in items)
        println(item)
    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }
        var index1 = 0
        while(index1 < items.size) {
            println("item at $index1 is ${items[index1]}")
            index1++
        }


    }

