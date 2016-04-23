package bugs

fun parse(text: String) = text.split(";\\s*".toRegex())
  .map { it.split("=", limit=2) }
  .associate {
    if (it.size < 2) return null
    it[0].trim() to it[1]
  }

fun main(args: Array<String>) {
  val map = parse("hello=world; world")
  println(map?.size)
}
