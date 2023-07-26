import java.util.Arrays;

public class quicksort {

  public static void main(String[] args) {
    int arr[] = { 235, 34, 5234, 23, 42, 3 };
    quickSort(arr, 0, arr.length - 1);
    System.out.println(Arrays.toString(arr));
  }

  public static void quickSort(int arr[], int low, int high) {
    if (low >= high) {
      return;
    }
    int start = low;
    int end = high;
    int mid = (start + end) / 2;
    int pivot = arr[mid];
    System.out.println("pivot=" + pivot);
    while (start <= end) {
      while (arr[start] < pivot) {
        //good going
        start++;
      }
      while (arr[end] > pivot) {
        //good going
        end--;
      }
      if (start <= end) {
        //it might be possible depending on thew pivot element that start might getter bigger than then the end variable
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
      }
    }
    // now the pivot is at proper index
    System.out.println(Arrays.toString(arr));
    quickSort(arr, low, end);
    quickSort(arr, start, high);
  }
}
