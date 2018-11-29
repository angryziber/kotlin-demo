package intro.advanced

import java.io.ByteArrayInputStream

fun main() {
  // These are all library functions

  with("string") {
    println(length)
  }

  synchronized("") {
    // thread-safe
  }

  ByteArrayInputStream("a".toByteArray()).use {
    // auto-closing
  }

  Person("Anton").apply {
    println(name)
  }
}