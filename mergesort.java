import java.util.Arrays;

public class mergesort {

  public static void main(String[] args) {
    int arr[] = {235,34,5234,23,42,3};
    arr = MergeSort(arr);
    System.out.println(Arrays.toString(arr));
  }

  static int[] MergeSort(int arr[]) {
    if (arr.length == 1) {
      return arr;
    }
    int mid = arr.length / 2;
    int left[] = MergeSort(Arrays.copyOfRange(arr, 0, mid));
    //this function copies the array from  start to mid the mid value is not included in the final array
    int right[] = MergeSort(Arrays.copyOfRange(arr, mid, arr.length));
    return merge(left, right);
  }

  static int[] merge(int left[], int right[]) {
    int size = left.length + right.length;
    int mix[] = new int[size];
    int i = 0;
    int j = 0;
    int k = 0;
    while (i < left.length && j < right.length) //if we add -1  we must add <=
    {
      if (left[i] < right[j]) {
        mix[k] = left[i];
        i++;
      } else {
        mix[k] = right[j];
        j++;
      }
      k++;
    }
    //it may me possible that both arrays are of differnt size
    while (i < left.length) {
      mix[k] = left[i];
      i++;
      k++;
    }
    while (j < right.length) {
      mix[k] = right[j];
      j++;
      k++;
    }
    return mix;
  }
}
