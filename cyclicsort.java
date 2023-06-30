import java.util.Arrays;

public class cyclicsort {

  public static void main(String[] args) {
    int a[] = { 3, 4, 2, 1, 6, 5, 9, 8, 7 };
    //when given nos. from range 1 to N use cyclic sort
    //Time complexity O(n)
    System.out.println(Arrays.toString(csort(a)));
  }

  public static int[] csort(int a[]) {
    int i = 0;
    while (i < a.length) {
      int correctindex = a[i] - 1;
      if (a[i] != a[correctindex]) {
        int temp = a[correctindex];

        a[correctindex] = a[i];
        a[i] = temp;
      } else {
        i++;
      }
    }
    return a;
  }
}
