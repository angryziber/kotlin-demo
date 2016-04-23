package nullability

class BooleanProvider() {
  val b = true
}

fun main(args: Array<String>) {
  val provider: BooleanProvider? = null
  if (provider != null && provider.b) println("true")
}