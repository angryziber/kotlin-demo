package intro.advanced

fun main() {
  val notNull: String = ""
  val nullable: String? = null

  println(notNull.length)
  println(nullable?.length)
  println(nullable ?: "hello")
}