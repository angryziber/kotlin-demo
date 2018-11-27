package intro.advanced

data class Person(val name: String)

fun main() {
  val x: Any? = null
  when (x) {
    "" -> println("empty String")
    is String -> println("a String")
    0, 1 -> print("0 or 1")
    in 2..10 -> print("from 2 to 10")
    Person("Anton") -> print("is Anton")
    x.toString().startsWith("A") -> print("starts with A")
    else -> print("nothing else matched")
  }
}