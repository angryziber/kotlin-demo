package templates

import builders.html
import java.time.LocalDate

fun htmlBuilder(person: Person) = html {
  body {
    h1 { +person.name }
    p { +"Hobbies" }
    ul {
      for (hobby in person.hobbies)
        li { +hobby }
    }
  }
}

fun main() {
  val person = Person("Anton", LocalDate.of(1982, 10, 21), listOf("Hobby 1", "Hobby 2"))
  println(htmlBuilder(person))
}