package mocking

import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MockkTest {
  @Test fun finalClasses() {
    val o = mockk<KotlinClass> {
      every { mockMe("hello", any()) } returns "world"
    }

    // or every { o.mockMe("hello", any()) } returns "world"

    assertEquals("world", o.mockMe("hello", "anything"))

    verify { o.mockMe("hello", "anything") }
    verify(exactly = 0) { o.mockMe("not hello", any()) }
  }

  class KotlinClass {
    fun mockMe(s1: String, s2: String): String = s1
  }
}