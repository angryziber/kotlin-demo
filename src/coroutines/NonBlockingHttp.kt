package coroutines

import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.http.userAgent

suspend fun main() {
  val http = HttpClient()
  val ip = http.get<String>("https://api.ipify.org")
  val location = http.get<String>("http://ip-api.com/line/$ip")
  val city = location.lines()[5]
  val weather = http.get<String>("http://wttr.in/$city?0") { userAgent("curl") }
  println(weather)
}