
import com.nhaarman.mockitokotlin2.*
import org.junit.jupiter.api.Test
import java.util.*
import java.util.concurrent.Executor
import kotlin.test.assertEquals

class MockitoKotlinTest {
  @Test fun whenever() {
    val executor = mock<Executor>()
    whenever(executor.execute(any())).then { print("Executed!") }

    val runnable = Runnable { print("Runnable") }
    executor.execute(runnable)

    verify(executor).execute(runnable)
  }

  @Test fun verifySetter() {
    val date: Date = mock()
    date.time = 5L

    verify(date).time = 5L
    verify(date).time = any()
  }

  @Test fun coolWay() {
    val date = mock<Date> {
      on {time} doReturn 123
    }
    assertEquals(123L, date.time)
  }
}