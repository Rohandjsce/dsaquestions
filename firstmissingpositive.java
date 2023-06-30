import java.util.Arrays;

public class firstmissingpositive {

  public static void main(String[] args) {
    int nums[] = { 7,8,9,11,12 };
     System.out.println(firtmissingPositive(nums));
  }

  public static int firtmissingPositive(int nums[]) {
    int i = 0;
    while (i < nums.length) {
      int correctindex = nums[i] - 1;
      if (
        nums[i] > 0 &&  nums[i] <= nums.length && nums[i] != nums[correctindex] 
      ) {
        int temp = nums[correctindex];

        nums[correctindex] = nums[i];
        nums[i] = temp;
      } else {
        i++;
      }
    }
    System.out.println(Arrays.toString(nums));
    //search for missing no
    for (int j = 0; j < nums.length; j++) {
      if (nums[j] != j + 1) {
        return j + 1;
      }
    } 
    //if everything is good return n+1
    return nums.length + 1;
  }
}
