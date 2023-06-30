public class checkifastringispalindrome {

  public static void main(String[] args) {
    String s = " ";
    System.out.println(checkpalindrome(s));
  }

  public static boolean checkpalindrome(String s) {
    s=s.toLowerCase();
    int start = 0;
    int end = s.length() - 1;
    while (start <= end) {
      if (s.charAt(start) == s.charAt(end)) {
        start++;
        end--;
      } else {
        return false;
      }
    }
    return true;
  }
}
