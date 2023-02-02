import kotlin.random.Random

class Calculations : Numbers() {

   var n:Int = 0
    override  fun twoPlusRand(): Int {
        n = 2 + Random.nextInt(400, 600)
        return n
    }

}