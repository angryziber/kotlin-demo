package coroutines

import kotlinx.coroutines.delay

suspend fun main() {
  repeat(5) {
    println("Hello ${Thread.currentThread()}")
    delay(1000)
  }
}