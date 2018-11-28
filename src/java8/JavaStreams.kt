package java8

import java.util.stream.Collectors.toList

class JavaStreams {
  val list = listOf(1, 2, 3)
  val mutable = mutableListOf(1, 2, 3)
  val range = 1..10
}

fun main(args: Array<String>) {
  val list = JavaStreams().list

  println(list.stream().filter { it > 2 }.collect(toList()) as Any)

  // vs

  println(list.filter { it > 2 })

  println(list.asSequence().filter { it > 2 }.toList())
}