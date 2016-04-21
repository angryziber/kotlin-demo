class BooleanProvider() {
  val b = true
}

fun main(args: Array<String>) {
  val provider: BooleanProvider? = null
  if (provider != null && provider.b) println("true")

  val x = null
  println("${x}")
}