class Nullability {
}

fun main() {
   println( descString("abdul"))
}

fun descString(myString: String?): String {
    if(myString != null && myString.isBlank()) {
        return "String length is ${myString.length}"
    }

        return "string is empty"

}