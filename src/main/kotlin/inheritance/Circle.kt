package inheritance

class Circle: Shape() {
    override fun draw(){
        println("drawing circle")
    }
}

fun main() {
    val circle: Circle = Circle()
    circle.draw()
}
