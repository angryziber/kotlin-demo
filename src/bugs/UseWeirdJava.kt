import bugs.WeirdJava

fun main(args: Array<String>) {
  // Doesn't compile:
  // WeirdJava.Api.run();

  // Workaround:
  val api = WeirdJava.Api
  api.run()
}