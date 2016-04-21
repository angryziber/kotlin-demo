package annotations

import kotlin.reflect.jvm.javaField

class KotlinAnnotations {
  @Ann val hello = "x"
}

fun main(args: Array<String>) {
  println(KotlinAnnotations::hello.getter.annotations)
  println(KotlinAnnotations::hello.javaField!!.annotations[0])
}