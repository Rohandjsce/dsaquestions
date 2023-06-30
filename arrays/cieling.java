import java.util.*;

//smallest no in an array >= target element of the array
public class cieling {

  public static void main(String[] args) {
    int[] a = { 12, 13, 44, 55, 66, 78, 89 };
    int target = 100;
    System.out.println(ciel(a, target));
  }

  public static int ciel(int a[], int target) {
    int start = 0;
    int end = a.length;
    int mid=0;
    if(target>a[a.length-1])
    {
      return -1;
    }
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
return a[mid+1];
  }
}
