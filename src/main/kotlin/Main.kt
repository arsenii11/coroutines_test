import kotlinx.coroutines.delay
import java.util.*
import kotlin.math.*

fun main() {
    //randomCycle()
    val numbers = Numbers()
    val calculations = Calculations()
    println(numbers.twoPlusRand())
    println(calculations.twoPlusRand())

}


fun randomCycle(){
    val mainList = mutableListOf<Int>()
    try {

        var n: Int = readln().toInt()
        val limit =Random(0).nextInt(200, 1000)
        println("Limit is:$limit")
        Thread.sleep(1000)
        do { n += kotlin.random.Random(0).nextInt(0, 100)
            mainList.add(n)
        } while (n < limit)
        println("Numbers: $mainList")
    }
    catch (e:Exception){
        println("ERROR:$e")
    }
}

open class Numbers(){
     open fun twoPlusRand():Int {
        val num =  2 + kotlin.random.Random.nextInt(0,300)
         return num
    }

}



object TwoSum {
    fun twoSum(numbers: IntArray, target: Int): Pair<Int, Int>? {
        for (n in 0 until
                numbers.size) {
            for (i in n + 1 until numbers.size) {
                if (numbers[n] + numbers[i] == target) return Pair(n, i)
            }
        }
        return Pair(0, 0)
    }
}

val calc_1 = { number: Int -> number /3.123 * number.toDouble().pow(3.0) }

suspend fun doWork(name: String): String {
    delay(Random().nextInt(5000).toLong())
    return "Done. $name"
}
