//https://leetcode.com/problems/find-peak-element/
public class peak {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7,6,1};//also called bitonic array
        System.out.println(findPeakElement(nums));
    }
    
    public static int findPeakElement(int[] nums) {
        int start=0;
        int end=nums.length-1;
        int mid=0;
        while(start<end)
        {
            mid=start+(end-start)/2; 
            if(nums[mid]>nums[mid+1])
            {
                //in the decreasing part of array
                // this may be the ans but still look at left
               end=mid;
            }
            else if(nums[mid]<nums[mid+1])
            {
                
                start=mid+1;
            }
            
        }
        //in the end start will be equal to end pointing the largest element
return start;
        
    }
    
}
