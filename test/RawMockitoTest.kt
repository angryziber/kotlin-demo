
import org.junit.Ignore
import org.junit.Test
import org.mockito.Matchers.any
import org.mockito.Mockito.`when`
import org.mockito.Mockito.mock
import kotlin.test.assertEquals

open class RawMockitoTest {
  class KotlinClass {
    fun mockMe(s: String): String = s
  }

  @Test @Ignore("Doesn't work with non-open class")
  fun rawMockito() {
    val o = mock(KotlinClass::class.java)

    `when`(o.mockMe(any(String::class.java))).thenReturn("hello")

    assertEquals("hello", o.mockMe("any string"));
  }
}