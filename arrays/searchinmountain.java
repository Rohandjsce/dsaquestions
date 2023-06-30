public class searchinmountain {

  public static void main(String[] args) {
    int nums[] = { 1, 2, 3, 4, 5, 3, 1 };
    int target = 3;
    System.out.println(ans(nums,target));
  }

  //find peak element
  //search in 1st half of the array
  //if not found binary search in 2nd array
  public static int ans(int nums[],int target) {
    int peak=findpeak(nums);
    int anss=bsearch(peak,target,nums,0);
    return anss;
  }
  public static int findpeak(int nums[]) {
    int start = 0;
    int end = nums.length - 1;
    int mid = 0;
    while (start < end) {
      mid = start + (end - start) / 2;
      if (nums[mid] > nums[mid + 1]) {
        //in the decreasing part of array
        // this may be the ans but still look at left
        end = mid;
      } else if (nums[mid] < nums[mid + 1]) {
        start = mid + 1;
      }
    }
    //in the end start will be equal to end pointing the largest element
    return start ;
  }
  public static int bsearch(int peak,int target,int nums[],int start,int end) {
    end=peak;
    //int end = nums.length;
    int mid = start + (peak - start) / 2;
    //find whether the array is sorted in ascending or descending order
    boolean isasc = true;
    if (nums[start] < nums[start+1]) {
      isasc = true;
    } else {
      isasc = false;
    }

    if (isasc) {
      while (start <= peak) {
        mid = start + (peak - start) / 2; //better way to find mid in this way if start and end are big..mid will will not exceed the particular value for int
        if (target > nums[mid]) {
          start = mid + 1;
        } else {
          peak = mid - 1;
        }
      }
      return -1;
    } else if (target == nums[mid]) {
       
      return mid;
    } else {
      while (start <= peak) {
        mid = start + (peak - start) / 2; //better way to find mid in this way if start and end are big..mid will will not exceed the particular value for int
        if (
          target > nums[mid]
        ) { //{30,20,10,5,2}
          peak = mid - 1;
        } else {
          start = mid + 1;
        }
      }
      return -1;
    
  }
}
}

