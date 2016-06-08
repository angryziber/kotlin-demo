package intro.advanced

fun main(args: Array<String>) {
  var counter = 0
  Runnable {
    counter++
  }.run()
}