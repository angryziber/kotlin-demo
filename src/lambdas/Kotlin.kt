package lambdas

import java.util.function.Function

object Kotlin {
  fun helloLambda(f: (Int) -> Int) = f(1)
  fun helloKotlinSAM(f: Function1<Int, Int>) = f(1)
  fun helloJavaSAM(f: java.util.function.Function<Int, Int>) = f.apply(1)
}

fun main() {
  Java.hello { 1 }

  Kotlin.helloLambda { 1 }

  Kotlin.helloKotlinSAM { 1 }

  Kotlin.helloJavaSAM(Function { 1 })

  Kotlin.helloJavaSAM(object: Function<Int, Int> {
    override fun apply(t: Int): Int {
      return 1
    }
  })
}