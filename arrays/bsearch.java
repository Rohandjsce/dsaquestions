

public class bsearch {

  public static void main(String[] args) {
    int a[] = { 22, 33, 44, 66, 78, 79, 90 };
    int target = 90;
   System.out.println(binarysearch(a, target));
  } 

  public static int binarysearch(int a[], int target) {
    int start = 0;
    int end = a.length-1;
    //System.out.println(end);
    int mid;
    while(start<=end)
    {
  mid=start+(end-start)/2;//better way to find mid in this way if start and end are big..mid will will not exceed the particular value for int
  if(target>a[mid]) 
  {
    start=mid+1;
  } 
  else if(target==a[mid])
  {
    return mid;
  }
  else
  {
    end=mid-1;
  }
}
return -1;
    
  }
}
