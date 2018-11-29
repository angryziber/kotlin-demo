package intro.advanced

fun main() {
  var counter = 0
  Runnable {
    counter++
  }.run()
}