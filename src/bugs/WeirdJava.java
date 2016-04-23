package bugs;

public class WeirdJava {
  public static Api Api = () -> System.out.println("hello");

  public interface Api extends Runnable {
  }

  public static void main(String[] args) {
    WeirdJava.Api.run();
  }
}
