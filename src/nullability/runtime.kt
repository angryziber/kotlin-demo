package nullability

class RuntimeNotNull {
  fun hello(notNull: String) = print(notNull)
}

fun main() {
  RuntimeNotNull().hello(null as String)
}