package intro.advanced

fun List<String>.hello() = print(this)

fun main(args: Array<String>) {
  listOf("a", "b").hello()
}