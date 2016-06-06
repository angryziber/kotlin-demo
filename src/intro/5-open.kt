package intro

open class Extensible {
  open fun overridable() {}
}

class Extending: Extensible() {
  override fun overridable() {
    super.overridable()
  }
}
