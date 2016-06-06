package intro.advanced

import java.io.ByteArrayInputStream

fun main(args: Array<String>) {
  // These are all library functions

  with("") {
    println(length)
  }

  synchronized("") {
    // thread-safe
  }

  ByteArrayInputStream("a".toByteArray()).use {
    // auto-closing
  }
}