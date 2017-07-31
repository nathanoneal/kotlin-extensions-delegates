package Examples

fun instructionsEx1 () {
    println("First, uncomment test code.")
    println("Next, write an extension function with Int as the receiver type called 'isEven()'.")
    println("Return true if the int it is called on is even.")
}

//write extension function here
fun Int.isEven() = this % 2 == 0
