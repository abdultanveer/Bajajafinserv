fun main() {
    val myRectangle = Rectangle(5.0,2.0)
    println("the perimeter of rectangle is ${myRectangle.perimeter}")
    //val kotlin = "abdul"
    //println("hello world")
    //print(kotlin)
    sum(10,20)
    print(add(30,40))
    var a: Int =1
    val b = 2
    val c: Int
    c = 3
    a = 10
   // b = 20

}

fun sum(a: Int, b: Int): Int {
    println("the sum of $a and $b is ${a+b}")
    return a+b
}

fun add(a: Int, b: Int) = a+b
