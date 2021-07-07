class ConditionalExpressions {
}

fun main() {
    highestOf(10,20)
    println("max of 10 and 20 is ${highestOf(10,20)}")
}

fun highestOf(fno: Int, sno: Int ) = if(fno > sno ) fno else sno