public class revusingrecur {

  public static void main(String[] args) {
    System.out.println(rev(347267));
  }

  static int rev(int n) {
    int digits = (int) (Math.log10(n))+1;
    return helper(digits, n);
  }

   static int helper(int digits, int n) {
    if (n % 10 == n) {
      return n;
    }
    int rem = n % 10;
    return rem*(int)(Math.pow(10,digits-1))+helper(digits-1, n/10);
  }
}
