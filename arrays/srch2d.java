import java.util.*;
public class srch2d {
    public static void main(String[] args) 
    {
        int a[][]={{1,1,1},{1,23,4},{12, 23,44},{2312,23543,33,3}};
        int target=2312;
        int b[]= find2d(a, target);
        System.out.println(Arrays.toString(b)); 

    }
    public static int[] find2d(int a[][],int target) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(a[i][j]==target)
                {
                    return  new int[]{i,j}; //!look at this part again
                }
                
                
            }
        }
        return new int[]{-1,-1};


        
    }
}
