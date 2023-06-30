import java.util.*;
// search for 3 in the range of index x to y
public class srchinrange {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a[]={12,23,12,423,452,35,63,4142,3423,5,54,45};
System.out.println("enter the range");
System.out.println("enter start");
int start=sc.nextInt();
System.out.println("enter end");
int end=sc.nextInt();
System.out.println("enter the no. you want to search");
int target=sc.nextInt();
sr(a,start,end,target);
        
    }
    public static void sr(int a[],int start,int end,int target) {
        if (a.length == 0) {
            System.out.println("enter a valid array");
          }
      
          for (int index = start; index < end; index++) {
            if (target == a[index]) {
              System.out.println("found");
              break;
            }
          }
      
          

        
    }
}
