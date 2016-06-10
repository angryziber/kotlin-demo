package nullability

class RuntimeNotNull {
  fun hello(notNull: String) = print(notNull)
}

fun main(args: Array<String>) {
  RuntimeNotNull().hello(null as String)
}