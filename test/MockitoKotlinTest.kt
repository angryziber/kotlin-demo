
import com.nhaarman.mockitokotlin2.any
import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.verify
import com.nhaarman.mockitokotlin2.whenever
import org.junit.jupiter.api.Test
import java.util.*
import java.util.concurrent.Executor

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
}