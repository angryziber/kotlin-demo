package intro.advanced

fun main(args: Array<String>) {
  var notNull: String = ""
  var nullable: String? = null

  println(notNull.length)
  println(nullable?.length)
  println(nullable ?: "hello")
}