package builders

@DslMarker annotation class BeerLang

@BeerLang data class Recipe(var name: String? = null, var hops: List<Hops> = mutableListOf())
@BeerLang data class Hops(var name: String? = null, var atMinute: Int = 0, var grams: Int = 0)

fun beer(build: Recipe.() -> Unit) = Recipe().apply(build)
fun Recipe.hops(build: Hops.() -> Unit) { hops += Hops().apply(build) }

val recipe = beer {
  name = "Simple IPA"

  hops {
    name = "Cascade"
    grams = 100
    atMinute = 15
  }
}

fun main() {
  println(recipe)
}
