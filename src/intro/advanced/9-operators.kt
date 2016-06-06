package intro.advanced

data class Complex(val r: Double, val i: Double) {
  operator infix fun plus(that: Complex) = Complex(r + that.r, i + that.i)
  operator infix fun minus(that: Complex) = Complex(r - that.r, i - that.i)
}

fun main(args: Array<String>) {
  print(Complex(1.0, 0.0) + Complex(2.0, -1.0))
}
