import java.util.Arrays;
import java .util.Scanner;
public class bubblesort {

  public static void main(String[] args) {
    //int a[] = { 123, 2, 423, 21, 423, 5, 345, 3, 24, 3134, 32, 5 };
Scanner sc=new Scanner(System.in);
int a[]=new int[5];
for(int i=0;i<a.length;i++)
{
  a[i]=sc.nextInt();
}
    System.out.println(Arrays.toString(bsort(a)));
  }

  public static void swap(int a[], int j) {
    int temp = a[j];
    a[j] = a[j - 1];
    a[j - 1] = temp;
  }

  public static int[] bsort(int a[]) {
    boolean swapped=false;
    for (int i = 0; i < a.length; i++) {
      for (int j = 1; j < a.length - i; j++) {
        if (a[j] < a[j - 1]) {
          swap(a, j);
          swapped = true;
        }
        
      }
      if (swapped == false) {
        break;
      }
    }
    return a;
  }
}
