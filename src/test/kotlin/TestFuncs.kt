import kotlin.test.*
import kotlin.test.assertEquals

class TestFuncs {
    @Test fun validIndexTest(){
        val sut = validIndex('6')
        assertEquals(SIZE_PAIRS>6, sut)
        assertFalse(validIndex('A'))
    }
}