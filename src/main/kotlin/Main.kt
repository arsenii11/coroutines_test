import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import java.lang.Math.pow
import java.lang.Math.random
import java.util.*
import kotlin.math.*

fun main() {
    randomCycle()
}


fun randomCycle(){
    try {

        var n: Int = readln().toInt()
        val limit =Random(0).nextInt(200, 1000)
        println("Limit is:$limit")
        Thread.sleep(1000)
        do {
            println("Number:$n")
            n += kotlin.random.Random(0).nextInt(0, 100)
        } while (n < limit)
    }
    catch (e:Exception){
        println("ERROR:$e")
    }
}



object TwoSum {
    fun twoSum(numbers: IntArray, target: Int): Pair<Int, Int>? {
        for (n in 0 until numbers.size) {
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
