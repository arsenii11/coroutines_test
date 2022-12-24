import kotlinx.coroutines.*
import kotlin.random.Random

fun main(): Unit = runBlocking {
    val couroutines: List<Deferred<String>> = List(100) {
        async (start = CoroutineStart.ATOMIC){
            doWork(it.toString())
        }
    }
    couroutines.forEach{
        println(it.await())
    }
}

suspend fun doWork(name:String):String{
    delay(Random.nextInt(5000).toLong())
    return "Done. $name"
}
