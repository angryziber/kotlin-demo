package intro

object Singleton

class Klass {
  companion object {
    val hello = "World"

    @JvmStatic val reallyNeedStatic = "static"
  }
}

fun main() {
  println(Klass.hello)
}
