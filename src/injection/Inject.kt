package injection

annotation class Inject

open class SuperService
class DuperService: SuperService()

class MegaService {
  @Inject var superService: SuperService? = null
  @Inject lateinit var duperService: DuperService

  fun doSomething() = duperService.toString()
}

fun main() {
  println(MegaService().doSomething())
}
