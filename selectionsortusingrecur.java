import java.util.Arrays;

/**
 * selectionsortusingrecur
 */
public class selectionsortusingrecur {

  public static void main(String[] args) {
    int arr[] = { 4, 3, 22, 1 };
    ssort(arr, arr.length - 1, 0, 0);
    System.out.println(Arrays.toString(arr));
  }

  static void ssort(int arr[], int lastindex, int c, int max) {
    if (lastindex == 0) {
      return;
    }
    if (lastindex > c) {
      if (arr[c] > arr[max]) {
        ssort(arr, lastindex, c + 1, c);
      } else {
        int temp = arr[c];
        arr[c] = arr[c + 1];
        arr[c + 1] = temp;
        ssort(arr, lastindex, c, max);
      }
    }
  }
}
