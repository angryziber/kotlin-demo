package nullability

fun main() {
  val s: String? = null
  // if (s?.isEmpty()) println("true") - not Groovy
  if (s != null && s.isEmpty()) println("true")
}