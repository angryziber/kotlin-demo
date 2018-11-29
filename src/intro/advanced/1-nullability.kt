package intro.advanced

fun main() {
  var notNull: String = ""
  var nullable: String? = null

  println(notNull.length)
  println(nullable?.length)
  println(nullable ?: "hello")
}