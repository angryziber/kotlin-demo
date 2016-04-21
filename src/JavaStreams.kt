import java.util.stream.Collectors.toList

class JavaStreams {
  val list = listOf(1, 2, 3)
  val mutable = mutableListOf(1, 2, 3)
  val range = 1..10
}

fun main(args: Array<String>) {
  val list = listOf(1, 2, 3) as java.util.Collection<Int>
  println(list.stream().filter { it > 2 }.collect(toList()))
}