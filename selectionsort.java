import java.util.Arrays;

public class selectionsort {

  public static void main(String[] args) {
    int a[] = { 2, 34, 234, 23, 42, 5, 3, 432, 52 }; //9
    System.out.println(Arrays.toString(ssort(a)));
  }

  public static int[] ssort(int a[]) {
    for (int i = 0; i < a.length; i++) {
      int last = a.length - i - 1;
      int max = findmaxindex(a, last);
      swap(a, max, last);
    }
    return a;
  }

  public static void swap(int a[], int max, int last) {
    int temp = a[max];
    a[last] = temp;
    a[max] = a[last];
  }

  public static int findmaxindex(int a[], int last) {
    int max = 0;
    for (int i = 1; i <= last; i++) {
      if (a[i - 1] < a[i]) {
        max = i;
      }
    }
    return max;
  }
}
