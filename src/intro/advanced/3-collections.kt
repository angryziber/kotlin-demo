package intro.advanced

fun main(args: Array<String>) {
  val list = listOf(1, 2, 3)
  println(list is kotlin.collections.List<*>)
  println(list is java.util.List<*>)

  // impossible, use mutableListOf():
  // list.add(1)

  list.filter { it > 1 }.map { it.toString() }.sortedBy { it.hashCode() }
}