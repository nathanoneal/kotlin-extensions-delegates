package Examples

import kotlin.properties.Delegates

fun instructionsEx3 () {
    println("Change the 'password' property to use Delegates.vetoable().")
    println("The value should be vetoed if the new value contains the old value.")
}

//make the password property vetoable if new contains old
class User {
    var password: String by Delegates.vetoable("default") {
        prop, old, new -> !new.contains(old)
    }
}

