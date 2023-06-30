import java.util.*;

// You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.
// A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.

public class leetcode1672 {

  public static void main(String[] args) {
int[][]  accounts={{1,2,3},{2,10,4},{4,5,6}};
System.out.println(maximumWealth(accounts));


  }
//person is row and accounts is equal to coloumns
  public static int maximumWealth(int[][] accounts) {
    int max=0;
    for (int person = 0; person < accounts.length; person++) {
      //when you start a coloumn start a new sum
      
      int rowsum=0;
      for (int bankacc = 0; bankacc < accounts[person].length; bankacc++) {
        rowsum=rowsum+accounts[person][bankacc];
      }
      if(max<rowsum)
      max=rowsum;
      
    }
    return max;

  }
}
