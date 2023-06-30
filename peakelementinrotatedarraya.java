public class peakelementinrotatedarraya {

  public static void main(String[] args) {
    int a[] = { 4, 5, 1, 2, 3 };
  int  target=findpivot(a);
System.out.println(search(a,target));
  }
static int search(int a[],int target)
{

}
  static int findpivot(int a[]) {
    int start = 0;
    int end = a.length - 1;
    while (start <= end) {
      int mid = start + (end - start) / 2;
      //4cases over here
      if (mid < end && a[mid] > a[mid + 1]) {
        return a[mid];
      } else if (mid > start && a[mid] < a[mid - 1]) {
        return a[mid - 1];
      } else if (a[mid] <= a[start]) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    return -1;
  }
}
