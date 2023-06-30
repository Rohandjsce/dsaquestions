public class bsearchusingrecussion {

  public static void main(String[] args) {
    int n = 20;
    int a[] = { 1, 2, 3, 3, 4, 5, 6, 7, 9, 20 };
    int start = 0;
    int end = a.length - 1;
    System.out.println(bsearch(n, a, start, end));
  }

  public static int bsearch(int n, int a[], int start, int end) { //i pass start and end in the arguments so that while doing the divide and conquer strategy the actual size of the array gets halved
    if (start > end) {
      return -1;
    }
    int mid = start + (end - start) / 2; //variables specific to that function call wull get inside the statement i.e mid
    if (a[mid] > n) {
      return bsearch(n, a, start, mid - 1);
    } else if (a[mid] == n) {
      return mid;
    } else {
      return bsearch(n, a, mid + 1, end);
    }
  }
}
