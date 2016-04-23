
import kotlin.concurrent.thread

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

  fun main() {
    x = "b"
    print(x)
  }
}

fun main(args: Array<String>) {
  val adHoc = object {
    var x: Int = 0
    var y: Int = 0
  }
  println(adHoc.javaClass)
  println(adHoc.x + adHoc.y)

  thread {
    print(123)
  }
}