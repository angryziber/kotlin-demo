package intro.advanced

data class Person(val name: String)

fun main(args: Array<String>) {
  val x: Any = ""
  when (x) {
    "" -> println("empty String")
    is String -> println("a String")
    0, 1 -> print("0 or 1")
    in 2..10 -> print("from 2 to 10")
    Person("Anton") -> print("is Anton")
    else -> print("nothing else matched")
  }
}