import kotlin.random.Random

class Calculations : Numbers() {
    val n = 0

    override fun twoPlusRand(n: Int?): Int {
        val m = n!! + 4
        val t = 2 + Random.nextInt(400, 600)
        return m
    }

}