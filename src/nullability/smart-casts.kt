package nullability

class Smart {
  var x: String? = "abc"

  fun run() {
    if (x != null) println(x?.substring(1, 2))

    var y: String? = "def"
    if (y != null) println(y.substring(1, 2))

    x?.let {
      print(it.substring(1, 2))
    }
  }
}

fun main(args: Array<String>) {
  Smart().run()
}
