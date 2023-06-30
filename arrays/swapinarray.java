import java.util.*;

public class swapinarray {

  public static void main(String[] args) {
    int arr[] = { 23, 312, 412, 4, 213, 12 };
    System.out.println(Arrays.toString(arr));
    swap(1, 2, arr);
    System.out.println(Arrays.toString(arr));
  }

   static void swap(int x, int y, int arr[]) {
    int p = arr[x];
    arr[x] = arr[y];
    arr[y] = p;
  }
}
