import java.util.Arrays;

/**
 * practicemergesort
 */
public class practicemergesort {

  public static void main(String[] args) {
    int arr[] = { 9, 3, 7, 5, 6, 4 };
    mergesort(arr);
    arr = mergesort(arr);
    System.out.println(Arrays.toString(arr));
  }

  public static int[] mergesort(int arr[]) {
    if (arr.length == 1) {
      return arr;
    }
System.out.println(Arrays.toString(arr));
    int mid = arr.length / 2;

    System.out.println(Arrays.toString(Arrays.copyOfRange(arr, 0, mid)));
    int left[] = mergesort(Arrays.copyOfRange(arr, 0, mid));

    System.out.println(Arrays.toString(Arrays.copyOfRange(arr, mid, arr.length)));
    int right[] = mergesort(Arrays.copyOfRange(arr, mid, arr.length));
    return merge(left, right);
  }

  static int[] merge(int left[], int right[]) {
    int i = 0;
    int j = 0;
    int k = 0;
    int size = left.length + right.length;
    int mergearr[] = new int[size];
    while (i < left.length && j < right.length) {
      if (left[i] < right[j]) {
        mergearr[k] = left[i];
        i++;
      } else {
        mergearr[k] = right[j];
        j++;
      }
      k++;
    }
    while (i < left.length) {
      mergearr[k] = left[i];
      i++;
      k++;
    }
    while (j < right.length) {
      mergearr[k] = right[j];
      j++;
      k++;
    }

    return mergearr;
  }
}
