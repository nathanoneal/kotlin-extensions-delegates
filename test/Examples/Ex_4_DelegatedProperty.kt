package Examples

import org.testng.annotations.Test
import kotlin.test.assertEquals

class Ex_4 {
    @Test fun testOk() {
        instructionsEx4()

        val name = Name()
        //accessCount should be 0
        assertEquals(0, name.nameValueAccessCount)

        //access nameValue
        name.nameValue
        //accessCount should now be 1
        assertEquals(1, name.nameValueAccessCount)

        //access 10 more times
        for (i in 1..10) name.nameValue
        //accessCount should now be 11
        assertEquals(11, name.nameValueAccessCount)
    }
}