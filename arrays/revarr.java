import java.util.*;

public class revarr {

  public static void main(String[] args) {
    int a[] = { 22, 3, 4, 46, 676 };
    //int a[] = { 22, 3, 4, 46, 676,6767 };

    System.out.println(Arrays.toString(a));
   // swap(1,2,a);
    reverse(a);
    System.out.println("reversed array ");
    System.out.println(Arrays.toString(a));
  }
  static void swap(int x, int y, int a[]) {
    int p = a[x];
    a[x] = a[y];
    a[y] = p;
    
  }
  //this method is also called as double pointer method
  static void reverse(int a[]) {
    int start = 0;
    int end = a.length - 1;
    while (start <= end) {
      swap(start,end,a);
      start++;
      end--;

    }

  }
}
