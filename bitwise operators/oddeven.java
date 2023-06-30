public class oddeven {

  public static void main(String[] args) {
    //if the binary ends with a 1 it is odd because ever other element is 2 raise to something if it ends with 0 it is even
    int n = 10;//10 ka binary equivalent is 0000 1010 and if we and this with 1 ||0 & 1 will be 0 thus it will be even and return false
   
    System.out.println(oddornot(n)); 
  }

  public static boolean oddornot(int n) {
    return ((n & 1) == 1);
  }
}
