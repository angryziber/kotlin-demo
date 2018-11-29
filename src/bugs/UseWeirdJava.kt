package bugs

fun main() {
  // Doesn't compile:
  // WeirdJava.Api.run();

  // Workaround:
  val api = WeirdJava.Api
  api.run()
}
