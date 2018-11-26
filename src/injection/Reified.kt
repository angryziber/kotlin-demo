package injection

import injection.Injector.inject
import kotlin.reflect.KClass

class MyService {
  val superService: SuperService = inject()

  fun doSomething() = superService.toString()
}

object Injector {
  val bindings = mutableMapOf<KClass<out Any>, Any>()

  fun <T: Any, I: T> bind(binding: Pair<KClass<T>, I>) { bindings += binding }
  inline fun <reified T: Any> inject(): T = bindings[T::class] as T
}

fun main() {
  Injector.bind(SuperService::class to DuperService())
  println(MyService().doSomething())
}
