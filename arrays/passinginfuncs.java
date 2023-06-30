import java.util.*;

class passinginfuncs {

  public static void main(String[] args) {
    int[] nums = { 3, 4, 5, 6, 12, 76 };
    System.out.println(Arrays.toString(nums));
    change(nums);
    System.out.println(Arrays.toString(nums));
    
  }

  static void change(int[] a) {
    a[2] = 69;
  }
}
