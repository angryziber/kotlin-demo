
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.mockito.ArgumentMatchers.any
import org.mockito.Mockito.`when`
import org.mockito.Mockito.mock
import java.util.*
import kotlin.test.assertEquals

class RawMockitoTest {
  @Test
  fun rawMockito() {
    val d = mock(Date::class.java)

    // `when` is a keyword in Kotlin
    `when`(d.time).thenReturn(123)

    assertEquals(123, d.time);
  }

  @Test @Disabled("Doesn't work with non-open class")
  fun finalClasses() {
    val o = mock(KotlinClass::class.java)

    // Mockito matchers return nulls, which fail Kotlin's runtime null checks
    `when`(o.mockMe(any(String::class.java) ?: "")).thenReturn("hello")

    assertEquals("hello", o.mockMe("any string"));
  }

  // mockito can only mock open classes and methods
  class KotlinClass {
    fun mockMe(s: String): String = s
  }
}