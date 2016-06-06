package intro

class Properties {
  var num = 5

  var numAsString: String
    get() = num.toString()
    private set(value) { num = value.toInt() }
}