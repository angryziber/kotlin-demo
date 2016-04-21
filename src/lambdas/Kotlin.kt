package lambdas

import java.util.function.Function

object Kotlin {
  fun helloLambda(f: (Int) -> Int) = f(1)
  fun helloSAM(f: java.util.function.Function<Int, Int>) = f.apply(1)
}

fun main(args: Array<String>) {
  Kotlin.helloLambda { 1 }

  // Kotlin.helloSAM { 1 }

  Kotlin.helloSAM(object: Function<Int, Int> {
    override fun apply(t: Int?): Int? {
      return 1
    }
  })

  Java.hello { 1 }
}