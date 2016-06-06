package intro

object Singleton

class Klass {
  companion object {
    val HELLO = "World"
  }
}

fun main(args: Array<String>) {
  println(Klass.HELLO)
}
