package Examples

import org.testng.annotations.Test
import kotlin.test.assertEquals

class Ex_3 {
    @Test fun testOk() {
        instructionsEx3()

        val user = User()
        user.password = "abcd"

        //should be vetoed
        user.password = "1234abcd"
        assertEquals("abcd", user.password)

        //should be ok
        user.password = "newPassword"
        assertEquals("newPassword", user.password)
    }
}