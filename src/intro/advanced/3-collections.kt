package intro.advanced

fun main(args: Array<String>) {
  val list = mutableListOf(1, 2, 3)
  println(list is kotlin.collections.List<*>)
  println(list is java.util.List<*>)

  // list.add(1) - impossible, use mutableListOf()

  list.filter { it > 1 }.map { it.toString() }.sortedBy { it.hashCode() }
}