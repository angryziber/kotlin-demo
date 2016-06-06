package intro

class Properties {
  var num = 5
    private set

  var numAsString: String
    get() = num.toString()
    set(value) { num = value.toInt() }
}