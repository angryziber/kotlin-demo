
import annotations.Ann
import kotlin.concurrent.thread
import kotlin.reflect.jvm.javaField
import kotlin.reflect.memberProperties

const val X: String = "z"

class Hello {
  val lz by lazy { 1 }

  internal var prop = "x"

  var x = "a"
    @JvmName("setXXX") internal set(value) {
      field = value + "!"
    }

  private val y: String
    get() = x

  @Ann val z: Int = 1
    @Ann get() = field

  fun main() {
    x = "b"
    print(x)
  }
}

fun int2int(x: Int): Int = x + 1

fun hello(x: java.util.function.Function<Int, Int>) = x.apply(1)
fun hello2(x: (Int) -> Int) = x(1)

fun main(args: Array<String>) {
  var x: (Int) -> Int = { 1 + it }
  println(x(2))

  x = ::int2int
  println(x(2))

  x = fun(x) = x + 2
  println(x(2))

  println((Hello::class as Any).javaClass)

  val adHoc = object {
    var x: Int = 0
    var y: Int = 0
  }
  println(adHoc.javaClass)
  println(adHoc.x + adHoc.y)

  thread {
    print(123)
  }


  println(Hello::class.memberProperties.find { it.name == "z" }?.javaField?.annotations?.get(0)?.annotationClass)
}