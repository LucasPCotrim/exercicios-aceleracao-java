import java.util.*;

public class App {
  public static void main(String[] args) {
    String[] array1 = {"banana", "laranja", "pera", "uva"};
    String[] array2 = {"uva", "pêssego", "morango", "laranja"};

    System.out.println("Array 1: " + Arrays.toString(array1));
    System.out.println("Array 1: " + Arrays.toString(array2));

    encontraElementosEmComum(array1, array2);
  }

 public static void encontraElementosEmComum(String[] array1, String[] array2) {
    for (int i = 0; i < array1.length; i++) {
      for (int j = 0; j < array2.length; j++) {
        if (array1[i].equals(array2[j])) {
          System.out.print(array1[i] + " ");
        }
      }
    }
  }
}
