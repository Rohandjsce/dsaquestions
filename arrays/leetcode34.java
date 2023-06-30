import java.util.*;

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class leetcode34 {

  public static void main(String[] args) {
    int nums[] = { 5, 7, 7, 8, 8, 10 };
    int target = 7;
    System.out.println(Arrays.toString(searchRange(nums, target)));
  }

  public static int search(int[] nums, int target, boolean startindex) {
    int ans = -1;
    int start = 0;
    int end = nums.length - 1;
    int mid = 0;
    while (start <= end) {
      mid = start + (end - start) / 2; //better way to find mid in this way if start and end are big..mid will will not exceed the particular value for int
      if (target > nums[mid]) {
        start = mid + 1;
      } else if (target < nums[mid]) {
        end = mid - 1;
      } else {
        //potential ans
        ans = mid;
        if (startindex) {
          end = mid - 1;
        } else {
          start = mid + 1;
        }
      }
    }
    return ans;
  }

  public static int[] searchRange(int[] nums, int target) {
    int ans[] = { -1, -1 };

    int start = search(nums, target, true);
    int end = search(nums, target, false);
    ans[0] = start;
    ans[1] = end;
    return ans;
  }
}
