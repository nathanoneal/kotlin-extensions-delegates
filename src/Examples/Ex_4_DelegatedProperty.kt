package Examples

import kotlin.properties.Delegates
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

fun instructionsEx4 () {
    println("Write a delegate for the 'nameValue' property that keeps a count of the times 'nameValue' is accessed.")
    println("Change the getter for 'nameValueAccessCount' to return the count from your delegate.")
}

class Name {
    //properties
    val nameValue = "myName"
    val nameValueAccessCount = 0
}

//create delegate class here that implements ReadOnlyProperty
//interface ReadOnlyProperty<in R, out T> {
//    operator fun getValue(thisRef: R, property: KProperty<*>): T
//}
