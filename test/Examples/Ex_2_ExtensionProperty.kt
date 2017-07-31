package Examples

import org.testng.annotations.Test
import kotlin.test.assertEquals

class Ex_2 {
    @Test fun testOk() {
        instructionsEx2()

        val list1 = listOf("one", "two", "three")
        val list2 = (1..10).toList()

        assertEquals(2, list1.midpointIndex)
        assertEquals(6, list2.midpointIndex)
    }
}