import java.util.*;

public class maxarray {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a[] = new int[5];
    for (int i = 0; i <5; i++) {
      a[i] = sc.nextInt();
    }
    System.out.println(Arrays.toString(a));
    System.out.println(a[maxarr(a)]);
  }

  static int maxarr(int a[]) {
    int max=0;
    for (int i = 0; i <4; i++) 
    {
      if (a[i] > a[i + 1]) {
        max = i;
      }
    }
    return max;
  }
}
