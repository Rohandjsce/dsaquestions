
public class findnthmagicno {

  public static void main(String[] args) {
    int n = 1;

    System.out.println(magicno(n));
  }

  // if 6 is 0110
  // magic no is 5^1*+5^2+5^2
  public static int magicno(int n) {
    int sum = 0;
    //int base = 5;
    int i = 1;
    while (n > 0) {
      int last = n & 1;
      sum = (int)(sum + (last * Math.pow(5,i)));
      i++;
      n = n >> 1;
    }
    return sum;
  }
}
