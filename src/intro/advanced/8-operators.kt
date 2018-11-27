package intro.advanced

data class Complex(val r: Double, val i: Double) {
  infix operator fun plus(that: Complex) = Complex(r + that.r, i + that.i)
  infix operator fun minus(that: Complex) = Complex(r - that.r, i - that.i)
}

fun main(args: Array<String>) {
  print(Complex(1.0, 0.0) + Complex(2.0, -1.0))
}
