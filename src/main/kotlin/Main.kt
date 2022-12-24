import kotlinx.coroutines.*
import kotlin.random.Random

fun main(): Unit = runBlocking {
    launch {
    doWorld()
    }
    println("Hello")
}

suspend fun doWorld(){
    delay(2000L)
    println("World")
}