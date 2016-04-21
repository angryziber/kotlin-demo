package lambdas;

import java.util.function.Function;

public class Java {
  public static int hello(Function<Integer, Integer> f) {
    return f.apply(1);
  }

  public static void main(String[] args) {
    Java.hello(i -> 1);
    Kotlin.INSTANCE.helloLambda(i -> 1);
    Kotlin.INSTANCE.helloSAM(i -> 1);
  }
}
