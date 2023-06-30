import java.util.*;

public class insertionsort {

  public static void main(String[] args) {
    int a[] = { 123, 2, 423, 21, 423, 5, 345, 3, 24, 3134, 32, 5 };
    System.out.println(Arrays.toString(isort(a)));
  }

  public static int[] isort(int[] a) {
    for (int i = 0; i < a.length - 1; i++) {
      for (int j = i + 1; j > 0; j--) {
        if (a[j] < a[j - 1]) {
          int temp = a[j];
          a[j] = a[j - 1];
          a[j - 1] = temp;
        } else {
          break;
        }
      }
    }
    return a;
  }
}
