
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.mockito.Matchers.any
import org.mockito.Mockito.`when`
import org.mockito.Mockito.mock
import kotlin.test.assertEquals

open class RawMockitoTest {
  // mockito can only mock open classes and methods
  open class KotlinClass {
    open fun mockMe(s: String): String = s
  }

  @Test @Disabled("Doesn't work with non-open class")
  fun rawMockito() {
    val o = mock(KotlinClass::class.java)

    // `when` is a reserved word in Kotlin
    // Mockito matchers return nulls, which fail Kotlin's runtime null checks
    `when`(o.mockMe(any(String::class.java) ?: "")).thenReturn("hello")

    assertEquals("hello", o.mockMe("any string"));
  }
}