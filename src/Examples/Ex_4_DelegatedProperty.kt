package Examples

import kotlin.properties.Delegates
import kotlin.properties.ReadOnlyProperty
import kotlin.reflect.KProperty

fun instructionsEx4 () {
    println("Write a delegate for the 'nameValue' property that keeps a count of the times 'nameValue' is accessed.")
    println("Change the getter for 'nameValueAccessCount' to return the count from your delegate.")
}

class Name {
    //delegate
    private val accessCounter = AccessCounter("MyName")
    //properties
    val nameValue: String by accessCounter
    val nameValueAccessCount: Int
        get() = accessCounter.count
}

class  AccessCounter<out T>(initialValue: T) : ReadOnlyProperty<Name, T> {
    var count = 0
    val value = initialValue

    override fun getValue(thisRef: Name, property: KProperty<*>): T {
        count++
        return value
    }
}
