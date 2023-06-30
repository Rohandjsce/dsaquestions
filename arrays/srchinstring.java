import java.util.*;

public class srchinstring {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a line");
    String s = sc.nextLine();
    System.out.println("what do you want to search");
    char ch = sc.next().charAt(0);
    System.out.println(srcchr(s, ch));
  }

  public static boolean srcchr(String str, char ch) {
    if (str.length() == 0) {
      return false;
    }

    for (int index = 0; index < str.length(); index++) {
      if (ch == str.charAt(index)) {
        return true;
      }
    }

    return false;
  }
}
