package Examples

import org.testng.annotations.Test
import kotlin.test.assertEquals

class Ex_1 {
    @Test fun testOk() {
        instructionsEx1()
        assertEquals(true, 64.isEven())
        assertEquals(false, 7.isEven())
    }
}