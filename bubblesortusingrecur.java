import java.util.Arrays;

public class bubblesortusingrecur {

  public static void main(String[] args) {
    int arr[] = { 4, 3, 22, 1 };
    bsort(arr, arr.length - 1, 0);
    System.out.println(Arrays.toString(arr));
  }

  static void bsort(int arr[], int lastindex, int c) {
    if (lastindex == 0) {
      return;
    }
    if (lastindex > c) { 
      if (arr[c] > arr[c + 1]) {
        //swap here
        int temp = arr[c];
        arr[c] = arr[c + 1];
        arr[c + 1] = temp;
      }
      bsort(arr, lastindex, c + 1);
    } else {
      bsort(arr, lastindex - 1, 0);
    }
  }
}
