
import com.nhaarman.mockito_kotlin.*
import org.junit.jupiter.api.Test
import java.util.*
import java.util.concurrent.Executor
import kotlin.test.assertEquals

class MockitoTest {
  @Test fun mockitoKotlin() {
    val executor = mock<Executor>()
    whenever(executor.execute(any())).then { print("Executed!") }

    val runnable = Runnable { print("Runnable") }
    executor.execute(runnable)

    verify(executor).execute(runnable)
  }

  @Test fun explicitCaptor() {
    val date: Date = mock()
    val time = argumentCaptor<Long>()

    date.time = 5L

    verify(date).time = time.capture()
    assertEquals(5L, time.firstValue)
  }

//  @Test fun implicitCaptor() {
//    val date: Date = mock()
//    date.time = 5L
//
//    verify(date).time = capture {
//      assertEquals(5L, it)
//    }
//  }
}