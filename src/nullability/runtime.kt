package nullability

class RuntimeNotNull {
  fun hello(x: String) = print(x)
}

fun main(args: Array<String>) {
  RuntimeNotNull().hello(null as String)
}