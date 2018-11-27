import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.expect

class HelloTest {
  @Test
  fun `finally nice test names`() {
    assertEquals("a", "a")
    expect("ab") {
      "a" + "b"
    }
  }
}