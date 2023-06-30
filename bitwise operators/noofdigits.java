 
public class noofdigits {
    public static void main(String[] args) {
        int n=101101;
        System.out.println(dig(n));
    }
    //no of digits in base b of no n is 
    //integer value of logn to the base b+1
    public static int dig(int n) {
        int ans=(int)(Math.log(n)/Math.log(10)+1);
return ans;
        
    }
}
