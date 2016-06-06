package intro

import java.util.*

class EmptyClass

class KotlinDate: Date()

class KotlinImplements: Iterable<String> {
  override fun iterator(): Iterator<String> {
    throw UnsupportedOperationException()
  }
}

fun main(args: Array<String>) {
  val instance = EmptyClass()
}
