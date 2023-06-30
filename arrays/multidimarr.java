import java.util.*;

public class multidimarr {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[][] a = new int[3][2];
    System.out.println(a.length);
    for (
      int i = 0;
      i < a.length;
      i++
    ) { //rows
      for (
        int j = 0;
        j < a[i].length;
        j++
      ) { //coloumn
        a[i][j] = sc.nextInt();
      }
    }
    // for (int i = 0; i < a.length; i++) //rows{
    //     for(int j=0;j<a[i].length;j++)//coloumn
    //     {
    //         System.out.println(a[i][j]+" ");

    //     }
    //     System.out.println();

    // for (int k = 0; k < a.length; k++) {
    //     System.out.println(Arrays.toString(a[k]));
    // }

    //enhanced for loop
    for (int[] arr : a) {
      System.out.println(Arrays.toString(arr));
    }
  }
}
