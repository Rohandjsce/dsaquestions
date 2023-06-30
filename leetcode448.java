import java.util.ArrayList;

import java.util.List;

public class leetcode448 {
    public static void main(String[] args) {
        int a[] = {4,3,2,7,8,2,3,1}; //ans should be 3
        //when given nos. from range 1 to N use cyclic sort
        //Time complexity O(n)
        System.out.println(disappearednumbers(a));
      }
      static List<Integer> disappearednumbers(int a[])
      {
       
        int i=0;
        //this will also deal with duplicates
        while(i<a.length)
        {
            int correctindex = a[i] - 1;
      if (a[i] != a[correctindex]) {
        int temp = a[correctindex];

        a[correctindex] = a[i];
        a[i] = temp;
      } else {
        i++;
      }
        }
        List<Integer> ans= new ArrayList<>();   
        for(int j=0;j<a.length;j++)
        {
            if(a[j]!=j+1)
            {
                ans.add(j+1);
            }

        }
        return ans;

      }
}
