import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.expect

class HelloTest {
  @Test
  fun name() {
    assertEquals("a", "a")
    expect("ab") {
      "a" + "b"
    }

    val r = Runnable { println("hello") }
  }
}