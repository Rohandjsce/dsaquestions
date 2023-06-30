import java.util.Arrays;

public class binarysearchin2darray {

  public static void main(String[] args) {
    int a[][] = { 
        { 1, 2, 3 ,8},
        { 4, 5, 6 ,9}, 
        { 6, 7, 8 ,19} 
    };
    System.out.println(a.length);
    int target = 19;
    System.out.println("the elements index position is \n"+Arrays.toString(bsearchinmatrix(target, a)));
  }

  public static int[] bsearchinmatrix(int target, int a[][]) {
    int row = 0;
    int col = a.length;
    while (row < a.length && col >= 0) 
    {
      if (target == a[row][col]) {
        return new int[] { row, col };
      } else if (target > a[row][col]) {
        row++;
      } else if (target < a[row][col]) {
        col--;
      }
    }
    return new int[] { -1, -1 };
  }
}
