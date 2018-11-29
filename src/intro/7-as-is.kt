package intro

import java.util.*

fun main() {
  val a: Any = Date()
  println(a is Date)
  println((a as Date).getTime())
}