

class orderagnosticarray {

  public static void main(String[] args) {
    //int a[] = { 22, 33, 44, 66, 78, 79, 90 };
    int a[] = { 90, 80, 70, 60, 60, 50 };
    int target = 70;
    System.out.println(binarysearch(a, target));
  }

  public static int binarysearch(int a[], int target) {
    int start = 0;
    int end = a.length;
    int mid = start + (end - start) / 2;
    //find whether the array is sorted in ascending or descending order
    boolean isasc = true;
    if (a[start] < a[start+1]) {
      isasc = true;
    } else {
      isasc = false;
    }

    if (isasc) {
      while (start <= end) {
        mid = start + (end - start) / 2; //better way to find mid in this way if start and end are big..mid will will not exceed the particular value for int
        if (target > a[mid]) {
          start = mid + 1;
        } else {
          end = mid - 1;
        }
      }
      return -1;
    } else if (target == a[mid]) {
       
      return mid;
    } else {
      while (start <= end) {
        mid = start + (end - start) / 2; //better way to find mid in this way if start and end are big..mid will will not exceed the particular value for int
        if (
          target > a[mid]
        ) { //{30,20,10,5,2}
          end = mid - 1;
        } else {
          start = mid + 1;
        }
      }
      return -1;
    }
  }
}
