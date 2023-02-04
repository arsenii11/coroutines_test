import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CalculationsTest {




    @Test
    fun getN() {
    }

    @Test
    fun setN() {
        assert(true)
    }

    @Test
    fun twoPlusRand() {
        val expected = 16
        assertEquals(expected, Calculations().twoPlusRand(expected-4))

    }
}