public class App {
  public static void main(String[] args) {
    int num = 5;

    for (int line = 1; line <= num; line++) {
      for (int column = 1; column <= line; column++) {
        System.out.print(line + " ");
      }
      System.out.println();
    }
  }
}
