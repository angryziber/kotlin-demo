package intro.advanced

import java.lang.System.err

sealed class Response
class Success(val body: String): Response()
class Failure(val error: String): Response()

fun main() {
  val response = createResponse()
  return when(response) {
    is Success -> println(response.body)
    is Failure -> err.println(response.error)
  }
}

fun createResponse(): Response = Success("Great")
