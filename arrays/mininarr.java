import java.util.*;

public class mininarr {

  public static void main(String[] args) {
    int a[] = { 2332, 4234, 234, 23, 423, 45234, 1234, 23, 54, 345, 23, 4 };
    System.out.println("minimum of this array is "+ma(a)); 
  }

  public static int ma(int a[]) {
    int min=a[0];
    for (int i = 1; i < a.length; i++) {
      if (min > a[i]) {
        min = a[i];
      }
    }
    return min;
  }
}
