package reflection

import java.util.*
import kotlin.reflect.full.memberFunctions
import kotlin.reflect.full.memberProperties

fun main() {
  val date = Date::class.constructors.find { it.parameters.isEmpty() }!!.call()
  println(date)
  println(date::class.memberFunctions.find { it.name == "toString" }!!.call(date))
  println(date::toString.call())
  println(date::getTime.returnType)
  println(date::getTime.call())
  println(date::class.memberProperties)

  val x1: (Overloading, String) -> Unit = Overloading::x
  val x2: (Int) -> Unit = Overloading()::x

  x1(Overloading(), "str")
  x2(123)
}

class Overloading {
  fun x(s: String) { println(s) }
  fun x(i: Int) { println(i) }
}