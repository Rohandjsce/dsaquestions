/**
 * substring
 */
public class substring {

  public static void main(String[] args) {

    String s = "abc";
    subString("", s);
    System.out.println(count);
  }
static int count=0;
  public static void subString(String ans, String s) {
    if (s.isEmpty()) {
      count++;
      
      System.out.println(ans);
      return;
    }
    char ch = s.charAt(0);
    //divide and conquer used here
    subString(ans, s.substring(1));
    subString(ans+ch, s.substring(1));
  }
}
