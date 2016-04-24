package nullability

class BooleanProvider() {
  val bool = true
}

fun main(args: Array<String>) {
  val provider: BooleanProvider? = null
  // if (provider?.b) println("true") - not Groovy
  if (provider != null && provider.bool) println("true")
}