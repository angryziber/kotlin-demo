package lambdas

fun int2int(x: Int): Int = x + 1

fun main(args: Array<String>) {
  var x: (Int) -> Int = { 1 + it }
  println(x(2))

  x = ::int2int
  println(x(2))

  x = fun(x) = x + 2
  println(x(2))

  main2()
  main3()
}

fun main2() = println("Hello")

fun main3() = {
  println("Hello")
}