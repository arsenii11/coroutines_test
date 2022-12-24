import kotlinx.coroutines.*
import kotlin.random.Random

fun main(): Unit = runBlocking {
    launch {
        delay(1000L)
        println("World")
    }
    println("Hello")
}
