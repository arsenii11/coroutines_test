import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class CalculationsTest {




    @Test
    fun getN() {
    }

    @Test
    fun setN() {
        assert(true)
    }

    fun checkNumber(number: Int): Boolean {
        return number in 400..800
    }

    @Test
    fun twoPlusRand() {
        val expected = 16
            assertTrue(checkNumber(Calculations().twoPlusRand(12)))

    }
}