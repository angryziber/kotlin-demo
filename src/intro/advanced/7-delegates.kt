package intro.advanced

import kotlin.properties.Delegates.observable

class Lazy {
  val hello by lazy { "very lazy" }
}

class Observable {
  val hello by observable("") { prop, old, new -> print("$old -> $new") }
}

class PersonAsMap(val data: Map<String, String>) {
  val firstName by data
  val lastName by data

  val fullName: String
    get() = "$firstName $lastName"
}

fun main(args: Array<String>) {
  val data = mapOf("firstName" to "Anton", "lastName" to "Keks")
  val person = PersonAsMap(data)
  println(person.firstName)
  println(person.fullName)
}