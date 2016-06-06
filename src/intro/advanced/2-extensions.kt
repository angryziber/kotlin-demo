package intro.advanced

fun List<String>.hello() = print(this)

fun main(args: Array<String>) {
  listOf("a", "b").hello()

  listOf(1, 2, 3).filter { it > 1 }.map { it.toString() }.groupBy { it.length }
}