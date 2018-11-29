package injection

annotation class Inject

open class SuperService {
  fun megaStuff() = print("Hello")
}
class DuperService: SuperService()

class MegaService {
  @Inject var superService: SuperService? = null
  @Inject lateinit var duperService: DuperService

  fun doSomething() = duperService.megaStuff()
}

fun main() {
  MegaService().doSomething()
}
