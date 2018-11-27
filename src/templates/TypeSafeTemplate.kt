package templates

import org.intellij.lang.annotations.Language
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle.*

data class Person(val name: String, val birthDay: LocalDate, val hobbies: List<String>)

@Language("HTML")
fun typeSafeTemplate(person: Person) = """
  <html lang="en">
    <body>
      <h1>Hello, ${+person.name}, born on ${+person.birthDay.format()}</h1>
      <h3>Hobbies</h3>
      <ul>
        ${person.hobbies.each { hobby -> """
          <li>${+hobby}</li>
        """.trim()}}
      </ul>
    </body>
  </html>
"""

fun main() {
  val customer = Person("Anton", LocalDate.of(1982, 10, 21), listOf("Hobby 1", "Hobby 2"))
  println(typeSafeTemplate(customer))
}

// DSL

fun LocalDate.format() = format(DateTimeFormatter.ofLocalizedDate(MEDIUM))

fun String?.escapeHTML() = this?.replace("<", "&lt;")?.replace("\"", "&quot;") ?: ""

operator fun String?.unaryPlus() = escapeHTML()

fun <T> Collection<T>.each(itemTemplate: (T) -> String) =
    joinToString("", transform = itemTemplate)
