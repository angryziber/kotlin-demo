package intro

class Hello(val message: String) {
  fun hello() = print(message)
}

data class DataClass(val hello: String)

fun main() {
  println(Hello("a") == Hello("a"))
  println(DataClass("a") == DataClass("a"))
}